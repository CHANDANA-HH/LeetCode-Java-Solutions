package RECURSION;

import java.util.Scanner;

public class josephus {
   public static int jos(int n, int k)
   {
    if(n==1)
    {
        return 0;
    }

    return (jos(n-1,k)+k)%n;
   } 
   
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n =sc.nextInt();
    System.out.println("Enter the value of k");
    int k=sc.nextInt();

    int res = jos(n,k);
    System.out.println(res);
   }


   // Extended Problem where the circle starts from 1 to n

//     public static int josOne(int n, int k)
//    {

//     return jos(n-1,k)+1;
//    } 
   


}
