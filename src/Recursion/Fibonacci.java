package Recursion;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int n=new Scanner(System.in).nextInt();
        System.out.println("Fabonacci of "+n+": "+FiboSeries(n));


    }

    public static int FiboSeries(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int f1=FiboSeries(n-1);
        int f2=FiboSeries(n-2);
        return f1+f2;


    }
}
