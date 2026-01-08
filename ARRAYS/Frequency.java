// Frequency of an element in an  sorted array

import java.util.Scanner;

class Frequency
{
    public static void frequency(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
           int j=i+1;
           int freq = 1;
           while(j<arr.length)
           {
            if(arr[i]==arr[j])
            {
                freq++;
                j++;
            }
            else{
                break;
            }

              
           }

            System.out.print(arr[i]+" ");
              System.out.println(freq);
              i=j;

          

        }
       
    }

    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

        frequency(arr);
    }
}