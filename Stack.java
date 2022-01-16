package DS.util;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * <b>Stack</b>
 * <br><br>
 * <b>LIFO - Last In First Out</b>
 * <br>
 * <blockquote>
 *     <p>
 *         A Stack is a linear data structure that follows the LIFO (Last-In-First-Out) principle. Stack has one end, whereas the Queue has two ends (front and rear). It contains only one pointer top pointer pointing to the topmost element of the stack. Whenever an element is added in the stack, it is added on the top of the stack, and the element can be deleted only from the stack. In other words, a stack can be defined as a container in which insertion and deletion can be done from the one end known as the top of the stack.
 *     </p>
 * </blockquote>
 * <br><br>
 * Throws:
 * <blockquote>
 * Stack overflow error
 * <br>
 * EmptyStack Error
 * </blockquote>
 * @author Bala
* */
public class Stack<E>
{
    private E[] arr;
    private int current_index = -1;

    public Stack()
    {
        arr = (E[]) new Object[100];
    }

    public int getLength()
    {
        return this.current_index+1;
    }

    public boolean is_Full()
    {
        return current_index == arr.length;
    }

    public boolean is_Empty()
    {
        return current_index == -1;
    }

    public void insert(E element)
    {
        if (!is_Full()) {
            current_index++;
            arr[current_index] = element;
        }
        else {
            throw new StackOverflowError("Cannot insert " + element);
        }
    }

    public E peek()
    {
        if (!is_Empty())
            return arr[current_index];
        else
            throw new EmptyStackException();
    }

    public E pop()
    {
        if (!is_Empty()) {
            E element = peek();
            current_index--;
            return element;
        }
        else {
            throw new EmptyStackException();
        }
    }

    public String toString()
    {
        E[] newArr = (E[]) new Object[current_index + 1];
        System.arraycopy(arr, 0, newArr, 0, newArr.length);
        return Arrays.toString(newArr);
    }

    public void sort()
    {
        E[] copyArr = (E[]) new Object[getLength()];
        System.arraycopy(arr, 0, copyArr, 0, getLength());
        this.MergeSort(copyArr);
        System.arraycopy(copyArr, 0, arr, 0, getLength());
    }

    private void MergeSort(E[] arr2)
    {
        int length = arr2.length;
        if (length < 2)
            return;
        else
        {
            int mid = length/2;
            E left_arr[] = (E[])new Object[mid];
            E right_arr[] = (E[])new Object[length-mid];
            System.arraycopy(arr2, 0, left_arr, 0, mid);
            System.arraycopy(arr2, mid, right_arr, 0, length-mid);

            MergeSort(left_arr);
            MergeSort(right_arr);
            combined_sort(arr2, left_arr, right_arr);
        }
    }

    private void combined_sort(Object[] main, Object[] left_arr, Object[] right_arr)
    {
        int i, j, k = 0;
        i = j = 0;
        while (i < left_arr.length && j < right_arr.length)
        {
            Comparable t = (Comparable) left_arr[i];
            if (t.compareTo(right_arr[j]) == 1)
            {
                main[k] = right_arr[j];
                j++;
            }
            else
            {
                main[k] = left_arr[i];
                i++;
            }
            k++;
        }

        while (i < left_arr.length)
        {
            main[k] = left_arr[i];
            i++;
            k++;
        }

        while (j < right_arr.length)
        {
            main[k] = right_arr[j];
            j++;
            k++;
        }
    }

    private void swap(Object[] main, int i, int j)
    {
        Object temp = main[i];
        main[i] = main[j];
        main[j] = temp;
    }
}
