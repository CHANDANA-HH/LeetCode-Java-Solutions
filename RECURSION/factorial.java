package RECURSION;

import java.util.Scanner;

public class factorial {
    public static int factorial_cal(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else if(n<0)
        {
            return -1;
        }

        return n*factorial_cal(n-1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int res = factorial_cal(n);
        System.out.println(res);
    }
}
