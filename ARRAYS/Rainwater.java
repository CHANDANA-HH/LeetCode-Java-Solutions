import java.util.Scanner;

public class Rainwater {

    public static int trapping(int[] arr)
    {
        int res=0;
        int l=0,r=arr.length-1;
        int rmax=0,lmax=0;

        while(l<r)
        {
            lmax=Math.max(lmax, arr[l]);
            rmax=Math.max(rmax,arr[r]);

            if(lmax<rmax)
            {
                res+=lmax-arr[l];
                l++;
            }

            else{
                res+=rmax-arr[r];
                r--;
            }

        }

        return res;
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
        
        trapping(arr);
    }
    
}
