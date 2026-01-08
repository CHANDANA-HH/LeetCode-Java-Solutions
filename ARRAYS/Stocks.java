// Stocks Buy and sell

import java.util.Scanner;

public class Stocks {

    public static int profit_loss(int[] arr)
    {
        int res=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                int p=arr[i]-arr[i-1];
                res+=p;
            }
        }

        return res;

    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println(profit_loss(arr));
    }


    
}
