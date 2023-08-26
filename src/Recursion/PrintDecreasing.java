package Recursion;

import java.util.Scanner;

public class PrintDecreasing
{
    // Tail Recursion
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        PD(n);

    }

    public static void PD(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);
        PD(n-1);

    }
}
