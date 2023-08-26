package Bitmasking;

import java.util.Scanner;

public class ShiftOperators
{
    public static void main(String[] args)
    {
        int n=6;
        System.out.println(n+"-> "+printBinary(n));
        int n2=n>>1;
        System.out.println(n2+"-> "+printBinary(n2));

        int n3=6;
        int n3_1=n3<<1;
        System.out.println(n3+"-> "+printBinary(3));
        System.out.println(n3_1+"-> "+printBinary(n3_1));


    }

    public static int printBinary(int n)
    {

        int sum=0;
        int mul=1;

        while(n>0)
        {
            int rem = n%2;
            sum = sum+rem*mul;
            n=n/2;
            mul=mul*10;
        }
        return sum;
    }
}
