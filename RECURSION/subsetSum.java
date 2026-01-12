package RECURSION;

import java.util.Scanner;

public class subsetSum {

    public static int subsum(int[] arr, int n, int sum)
    {
        if(n==0)
        {
            return (sum==0)?1:0;
        }

        return subsum(arr,n-1,sum)+subsum(arr,n-1,sum-arr[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       System.out.println("Enter the target sum:");
       int sum =sc.nextInt();
        int res = subsum(arr, n,sum);

        System.out.println(res);



        
    }
    
}
