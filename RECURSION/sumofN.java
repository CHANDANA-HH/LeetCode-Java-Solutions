package RECURSION;

import java.util.Scanner;

public class sumofN {
    public static int sum(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }

        return n+sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
         int res=sum(n);
         System.out.println(res);
    }
}
