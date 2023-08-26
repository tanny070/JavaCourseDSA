package Recursion;

import java.util.Scanner;

public class PowerInLessThanLinearTime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(powerCacl(a,b));
    }

    public static int powerCacl(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        int fn=powerCacl(a,b/2);
        fn=fn*fn;
        if(b%2 != 0)
        {
            fn=fn*a;
        }
        return fn;

    }
}
