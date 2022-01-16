package task;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastOccurrence
{
    public static void main(String[] args)
    {
        int[] arr = {
                1, 2, 1, 2, 1, 4, 3, 4, 2, 9, 4
        };
        System.out.println(Arrays.toString(arr));
        int frontIndex = -1, rearIndex = -1, x = new Scanner(System.in).nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
            {
                frontIndex = i;
                break;
            }
        }

        for (int i = arr.length-1; i >= frontIndex && frontIndex != -1; i--) {
            if (arr[i] == x)
            {
                rearIndex = i;
                break;
            }
        }

        if (frontIndex == -1)
        {
            System.out.println("Given occurance not found");
        }
        else if (frontIndex == rearIndex)
        {
            System.out.println("Given occurance one time found at : " + frontIndex);
        }
        else
        {
            System.out.println(frontIndex+" "+rearIndex);
        }


    }
}
