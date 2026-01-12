package RECURSION;

import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n)
    {
        if(n<=2)
        {
            return n-1;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int res= fibo(n);
        System.out.println(res);
    }
}
