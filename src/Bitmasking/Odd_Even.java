package Bitmasking;

import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n & 1) == 1 ? "Number is odd" : "Number is even");

    }
}
