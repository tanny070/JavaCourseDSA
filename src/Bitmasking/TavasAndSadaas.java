package Bitmasking;

import java.util.Scanner;

public class TavasAndSadaas
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        System.out.println(Index(str));


    }

    public static int Index(String str)
    {
        int n=str.length();
        int count=(1 << n)-2;
        int pos=0;
        for (int i = str.length()-1; i >=0 ; i--)
        {
            if(str.charAt(i) == '7')
            {
                count+=(1<<pos);
            }
            pos++;

        }
        return count+1;
    }
}
