#include<stdio.h>
#include<stdbool.h>

int arr[10];
int n = 10;
int current_index = -1;


bool is_Empty();
bool is_Full();
int first();
int last();
void insert(int);
void firstinsert(int);
void insertanywhere(int ,int);
int find(int);
int deleteLast();
int deletefirst();
void delete_element(int);
int deleteUsingIndex(int);
int find_prev(int x);
int find_next(int x);
void display();

void main(int x)
{
    int i = 1, option, index, element;

    while (i)
    {
        printf("\n\n1.Insert\n2.First insert\n3.insert anywhere\n4.Delete First\n5.DeleteLast\n6.DeleteElement\n7.Delete index based\n8.Find prev,\n9.Find next\n10. Display\n11.exit\n\n");

        printf("\n\nEnter your option to perform corresponding operation\n\n");
        scanf("%d", &option);
        switch (option)
        {
        case 1:
            printf("You chosen insert operation\n");
            printf("Enter a element : ");
            scanf("%d", &element);
            insert(element);
            break;
        case 2:
            printf("You chosen first insert operation\n");
            printf("Enter a element : ");
            scanf("%d", &element);
            firstinsert(element);
            break;
        case 3:
            printf("You chosen insert anywhere operation\n");
            printf("Enter a index : ");
            scanf("%d", &index);
            printf("Enter a element : ");
            scanf("%d", &element);
            insertanywhere(index, element);
            break;
        case 4:
            printf("You chosen delete first operation\n");
            printf("The deleted element from first index is : %d", deletefirst());
            break;    
        case 5:
            printf("You chosen delete last operation\n");
            printf("The deleted element from last index is : %d", deleteLast());
            break;
        case 6:
            printf("You chosen delete element operation\n");
            printf("Enter a element : ");
            scanf("%d", &element);
            delete_element(element);
            break;
        case 7:
            printf("You chosen delete index based operation\n");
            printf("Enter a index : ");
            scanf("%d", &index);
            deleteUsingIndex(index);
            break;    
        case 8:
            printf("You have chosen find prev operation\n");
            printf("Enter a element : ");
            scanf("%d", &element);
            printf("The element %d previous element is %d\n",element, find_prev(element));
            break;    
        case 9:
            printf("You have chosen find next operation\n");
            printf("Enter a element : ");
            scanf("%d", &element);
            printf("The element %d next element is %d\n",element, find_next(element));
            break;    
        case 10:
            printf("You have chosen display list operation\n");
            display();
            break;
        case 11:
            i = 0;
            break;
        default:
            break;
        }
    }
}

bool is_Empty()
{
    return current_index == -1;
}

bool is_Full()
{
    return current_index == n-1;
}

int first()
{
    if (!is_Empty())
    {
        return arr[0];
    }
    else
    {
        printf("List empty error\n");
        return -1;
    }
}

int last()
{
    if (!is_Empty())
    {
        return arr[current_index];
    }
    else
    {
        printf("List empty error\n");
        return -1;
    }
    
}
void insert(int x)
{
    if(current_index==n-1)
    {
        printf("list is full");
    }
    else
    {
        current_index++;
        arr[current_index]=x;
    
    }
}

void firstinsert(int x)
{
    if(current_index==n-1)
    {
        printf("list full error");
    }
    else
    {
        current_index++;
        for(int i = current_index; i>=1; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }
}
void insertanywhere(int index,int x)
{
    if(!is_Full() && index <= current_index)
    {
        current_index++;
        for(int i=current_index;i>index;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[index]=x;
    }
    else
    {
        if (is_Full())
        {
            printf("list full error cannot insert %d in list\n", x);
        }
        else
        {
            printf("Array index out of boundary exception\n");
        }
               
    }
}
void display()
{
    for(int i=0; i<=current_index; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}
int find(int x)
{
    if (!is_Empty())
    {
        for(int i = 0;i<=current_index;i++)
        {
            if(arr[i] == x)
            {
                return i;
            }    
        }
        printf("given element not present error\n\n");
        return -1;
    }
    else
    {
        printf("List is empty cannot find element\n");
        return -1;
    }
}
    
int deleteLast()
{
    if(!is_Empty())
    {
        int last = arr[current_index];
        current_index--;
        return last;
    }
    else
    {
        printf("list is empty");
        return -1; 
    }
}
int deletefirst()
{
    if(!is_Empty())
    {
        int first = arr[0];
        for(int i = 0; i < current_index;i++)
        {
            arr[i]=arr[i+1];
        }
        current_index--;
        return first;
    }
    else
    {
        printf("list is empty error\n");
        return -1;
    }
}

void delete_element(int x)
{
    int index = find(x);
    if (!is_Empty() && index != -1)
    {
        for (int i = index; i <= current_index; i++)
        {
            arr[i] = arr[i+1];
        }
        current_index--;
        printf("The element : %d is deleted\n", x);
    }
    else
    {
        if (is_Empty())
        {
            printf("List empty error\n");
        }
        else
        {
            printf("The given element not presented in list...\n");
        }
    }
    
}

int deleteUsingIndex(int index)
{
    if(!is_Empty() && index <= current_index)
    {
        for(int i=index;i<=current_index;i++)
        {
            arr[i]=arr[i+1];
        }
        current_index--;
        printf("The element deleted in the particular index successfully!...\n");
        return index;
    }
    else
    {
        if (is_Empty())
        {
           printf("list is empty error");
            return -1;
        }
        else
        {
            printf("Array index out of boundary exception");
            return -1;
        }
    }
}

int find_prev(int x)
{
    if (!is_Empty())
    {
        if (arr[0] == x)
        {
            printf("There is no previous element since it is the first element in list\n");
            return -1;
        }
        else
        {
            for (int i = 1; i <= current_index; i++)
            {
                if (arr[i] == x)
                {
                    return arr[i-1];
                }
            }
            printf("The given element is not presented in list\n");
            return -1;
        }
    }
    printf("There is no element in array since array is empty!...");
    return -1;
}
int find_next(int x)
{
    if (!is_Empty())
    {

        if (arr[current_index] == x)
        {
            printf("There is no next element since it is the last element in list\n");
            return -1;
        }
        else
        {
            for (int i = 0; i < current_index; i++)
            {
                if (arr[i] == x)
                {
                    return arr[i+1];
                }
            }
            printf("The given element is not presented in list\n");
            return -1;
        }
    }
}

/* 
insert(57);
    insert(12);
    insert(23);
    insert(56);
    display();
    firstinsert(10);
    insertanywhere(4, 67);
    /*display();
    find(11);
    delete(56);
    display();
    delete(23);
    display();
    insertanywhere(2,50);
    display();
    // deleteUsingIndex(2);
    // display();    

    // printf("Find previous : %d\n", find_prev(56));
    // printf("Find previous : %d\n", find_prev(12));
    // printf("Find previous : %d\n", find_prev(10));

    // delete_element(12);
    // display();
 */