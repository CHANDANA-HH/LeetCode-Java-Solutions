package RECURSION;

import java.util.Scanner;

public class towerofHanoi {
    public static int tower(int n, int from, int to, int aux)
    {
        if(n==1)
        {
            return 1;
        }

        return 2*tower(n-1,from,aux,to)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disc");
        int n = sc.nextInt();
        int res = tower(n,1,2,3);
        System.out.println(res);
    }
}
