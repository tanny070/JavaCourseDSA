package Recursion;

import java.util.Scanner;

public class Tail_Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fact(n,1));

    }

    public static int fact(int n,int ans)
    {
        if(n==1)
        {
            return ans;

        }
        return fact(n-1,ans*n);

    }
}
