package Array;
import java.util.*;

public class DivisibleSubArray
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        while (t>0)
        {
            int n=scanner.nextInt();
            int[] arr=new int[n];

            for (int i = 0; i < arr.length; i++)
            {
                arr[i]=scanner.nextInt();

            }
            System.out.println(GoodSunArray(arr));

            t--;
        }



    }

    public static long GoodSunArray(int arr[])
    {
        int n= arr.length;
        long[] frq=new long[n];
        int sum=0;
        frq[0]=1;

        for (int i = 0; i < frq.length; i++)
        {
            sum+=arr[i];
            sum=sum%n;
            if(sum<0)
            {
                sum+=n;
            }
            frq[sum]=frq[sum]+1;

        }

        long ans=0;
        for (int i = 0; i < frq.length; i++)
        {
            if(frq[i]>=2)
            {
                ans=ans+(frq[i]*(frq[i]-1))/2;
            }
            
        }
        return ans;


    }
}
