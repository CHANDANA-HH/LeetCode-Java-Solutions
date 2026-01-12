package RECURSION;

import java.util.Scanner;

public class digitalRoot {
    public static int root(int n) {
        // code here
        
        if(n==0)
        {
            return 0;
        }
        return 1+(n-1)%9;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int res=root(n);
        System.out.println(res);
    }
}
