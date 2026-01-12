package RECURSION;

import java.util.Scanner;

// A lucky number is defined using a special elimination process:
//    1. Start with natural numbers: 1, 2, 3, 4, 5, 6, ...
//    2. In the 1st step, remove every 2nd number.
//    3. In the 2nd step, remove every 3rd remaining number.
//    4. In the 3rd step, remove every 4th remaining number, and so on...
// This continues indefinitely. Given an integer n, determine if it remains after all steps.
// Return 1 if n is a lucky number, otherwise return 0.

public class luckyNumber {

    public static boolean isLucky(int n) {
        // code here
        if(isluckyHelper(n,2))
        {
            return true;
        }
        return false;
        
        
        
    }
    
    
    public static boolean isluckyHelper(int n, int k)
    {
        if(k>n)
        {
            return true;
        }
        
        if(n%k==0)
        {
            return false;
        }
        
        int newPos=n-(n/k);
        
        return  isluckyHelper(newPos,k+1);
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if(isLucky(n))
        {
            System.out.println("Its a lucky number");
        }
        else{
            System.out.println("Not a lucky number:");
        }



    }
    
}
