package String;

public class String_Demo2
{
    public static void main(String[] args)
    {
        String str="hello";
        String str1="hello";
        String st=new String("hello");
        String st2=new String("hello");

        System.out.println(str == st);
        System.out.println(str.equals(st));
        System.out.println(str == str1);

    }
}
