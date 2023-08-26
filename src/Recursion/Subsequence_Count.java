package Recursion;

public class Subsequence_Count
{
    static int count=0;
    public static void main(String[] args) {
        String str="abc";
        printSubSeq(str,"");
        System.out.println(count);
    }

    public static void printSubSeq(String ques,String ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(ans);
            count++;
            return;
        }
        char ch=ques.charAt(0);
        printSubSeq(ques.substring(1),ans);
        printSubSeq(ques.substring(1),ans+ch);
    }
}
