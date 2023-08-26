package Recursion;

public class Subsequence_Count2
{
    public static void main(String[] args) {
        String str="abc";
        System.out.println(printSubSeq(str,""));
    }

    public static int printSubSeq(String ques,String ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(ans+" ");
            return 1;
        }
        char ch=ques.charAt(0);
        int f1=printSubSeq(ques.substring(1),ans);
        int f2=printSubSeq(ques.substring(1),ans+ch);
        return f1+f2;
    }
}
