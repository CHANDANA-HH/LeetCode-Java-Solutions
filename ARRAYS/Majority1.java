// to find the majority if the occurance is more than half of length of array

import java.util.Scanner;

public class Majority1 {

    public static int findmajority(int[] arr)
    {
        int res=arr[0];
        int vote=1;
        for(int i=1;i<arr.length;i++)
        {
            if(vote==0)
            {
                res=arr[i];
                vote=1;
            }
            else if (res==arr[i])
            {
                vote++;
            }
            else
            {
                vote--;
            }

           

        }

         int count=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==res)
                {
                    count++;
                }
            }
                if(count>(arr.length/2))
                {
                    return res;
                }

                return 0;
            
            

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

       int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
        }

        int ans=findmajority(arr);
        System.out.println(ans);



        

        
}
}