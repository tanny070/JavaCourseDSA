package String;
import java.util.*;
public class String_Demo
{
    public static void main(String[] args)
    {
        String str="hello";
        String str1="hello";
        char c='a';
        System.out.println("str: "+str+" str2: "+str1);

        String str2=new String("hello");

        str=str+"bye";
        System.out.println(str);
        System.out.println(str.length());

    }
}
