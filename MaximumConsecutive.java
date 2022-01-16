package solution;
//        System.out.println(res == 0 ? num - num2 : Math.abs(Math.min(num - (num - res), Math.abs(num - ((num - res) + num2)))));

public class MaximumConsecutive
{
    public static void main(String[] args)
    {
        int arr[] = {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};

        var Max_consecutive = 0;
//        var t;
        char c;
        c = '5';

//        int maximum_consecutive = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 1)
            {
                count++;
                Max_consecutive = Math.max(count, Max_consecutive);
            }
            else
            {
                count = 0;
            }
        }
        System.out.println(Max_consecutive);
    }
}
