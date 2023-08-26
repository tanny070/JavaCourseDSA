package String;

import java.util.Scanner;

public class SubSequence
{
    public static void main(String[] args)
    {
        String ques=new Scanner(System.in).next();
        Print(ques,"");

    }

    public static void Print(String ques,String ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(ans+" ");
            return;
        }
        char ch=ques.charAt(0);
        Print(ques.substring(1),ans);
        Print(ques.substring(1),ans+ch);

    }
}
