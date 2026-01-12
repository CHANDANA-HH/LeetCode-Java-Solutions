package RECURSION;

import java.util.Scanner;

public class power {
    public  static int reverseExponentiation(int n) {
        // code here
        int rev=reverse(n,0);
        return power1(n,rev);
        
    }
        private static int reverse(int n, int rev)
        {
            if(n==0)
            {
                return rev;
            }
            
            return reverse(n/10, rev*10+(n%10));
        }
        
        private static int power1(int base, int exp)
        {
            if(exp==0)
            {
                return 1;
            }
            
            return base*power1(base,exp-1);
        }
        
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter the number ");
            int n=sc.nextInt();

            int res=reverseExponentiation(n);

            System.out.println(res);



        }

        // To find the power using recursion

    //     class Solution {
    // static int RecursivePower(int n, int p) {
    //     // Code here
        
    //     if(p==0)
    //     {
    //         return 1;
    //     }
    //     return n*RecursivePower(n,p-1);
    }
}

}
