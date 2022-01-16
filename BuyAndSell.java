package task;

import java.util.Arrays;

public class BuyAndSell
{

    public static int findMaxProfit(int[] prices)
    {
        if (prices == null || prices.length < 2)
            return 0;
        int buy = prices[0];
        int profit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i])
            {
                buy = prices[i];
                if (i == prices.length-1)
                    return 0;
                continue;
            }
            if (profit < prices[i] - buy)
            {
                profit = prices[i]-buy;
            }
        }
        return profit;
    }

    public static void main(String[] args)
    {
        System.out.println(findMaxProfit(null));
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxProfit(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxProfit(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxProfit(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxProfit(arr));
    }
}
