package RECURSION;

import java.util.Scanner;

public class subset {
    
    public static void  generate_subset(String str,int i, String curr)
    {
        
        if(i==str.length())
        {
            System.out.println(curr);
            return;
        }

        generate_subset(str, i+1, curr);
        generate_subset(str, i+1, curr+str.charAt(i));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        int i=0;
        String curr="";
        generate_subset(str, i, curr);
    }
}
