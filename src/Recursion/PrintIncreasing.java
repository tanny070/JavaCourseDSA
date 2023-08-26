package Recursion;

import java.util.Scanner;

public class PrintIncreasing
{
    // Head Recursion
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        PI(n);

    }

    public static void PI(int n)
    {
        if(n==0)
        {
            return;
        }


        PI(n-1);
        System.out.println(n);

    }
}