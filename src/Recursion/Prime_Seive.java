package Recursion;

import java.util.Arrays;

public class Prime_Seive
{
    public static void main(String[] args)
    {
        int n=100;
        PrintPrime(n);

    }

    //Time Complexity ->  Nlog(log(n))
    public static void PrintPrime(int n)
    {
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=true;
        prime[1]=true;
        for (int i = 2; i * i< prime.length ; i++)
        {
            if(prime[i])
            {
                for (int j = 2; j * i < prime.length ; j++)
                {
                    prime[i *j]=false;

                }

            }

        }

        for (int i = 2; i < prime.length; i++)
        {
            if(prime[i])
            {
                System.out.print(i+" ");
            }

        }
    }
}
