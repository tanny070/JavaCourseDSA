package Bitmasking;

import java.sql.SQLOutput;

public class SingleNumber3
{
    public static void main(String[] args)
    {
        int arr[]={1,2,1,3,2,5};
        int res[]=Single(arr);

        for (int i = 0; i < res.length; i++)
        {
            System.out.print(res[i]);

        }
        System.out.println(Single(arr));

    }

    public static int[] Single(int arr[])
    {
        int ans=0;
        for (int i = 0; i < arr.length; i++)
        {
            ans= ans ^ arr[i];

        }
        int mask=(ans &(~(ans-1)));
        int a=0;
        for (int i = 0; i < arr.length; i++)
        {
            if((arr[i] & mask) != 0)
            {
                a ^= arr[i];
            }

        }
        int b=ans^a;
        int[] ar={a,b};
        return ar;
    }



}
