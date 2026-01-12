package RECURSION;

import java.util.Scanner;

public class palindrome {
    public static boolean check_palindrome(String str, int start, int end)
    {
        if(start>=end)
        {
            return true;
        }

        return ((str.charAt(start)==str.charAt(end))&& check_palindrome(str,start+1,end-1));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        int i=0;
        int j=str.length()-1;
        if(check_palindrome(str, i, j))
        {
            System.out.println("Its a palindrome");
        }
        else
        {
            System.out.println("Its not palindrome");
        }
    }
}
