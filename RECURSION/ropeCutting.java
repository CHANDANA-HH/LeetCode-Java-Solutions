package RECURSION;

import java.util.Scanner;

public class ropeCutting {
    public static int cut(int n, int a, int b, int c)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return -1;
        }

        int res = Math.max(cut(n-a,a,b,c),Math.max(cut(n-b,a,b,c), cut(n-c,a,b,c)));

        if(res==-1)
        {
            return -1;
        }

        return res+1;

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the rope");
        int n=sc.nextInt();
        System.out.println("Enter the lengths :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res = cut(n, a, b,  c);
        if(res>=1)
        {
            System.out.println("It can be cut");
        }
        else
        {
            System.out.println("Not possible");
        }
    }
}
