package String;

import java.util.Scanner;

public class SubStringLengthWise
{
    public static void main(String[] args)
    {

        String str="Nitin";
        printSubString(str);
    }

    public static void printSubString(String str)
    {
        for (int len = 1; len <= str.length(); len++)
        {
            for (int j = len; j <= str.length() ; j++)
            {
                int i=j-len;

                System.out.println(str.substring(i,j));


            }

        }

    }
}
