package String;

public class StringDemo3
{
    public static void main(String[] args)
    {
        String str="abcdef";
        String str1="ghi";
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,1));
        System.out.println(str.concat(str1));
        System.out.println(str1.compareTo(str));

        if(str.compareTo(str1)>0)
        {
            System.out.println(str);

        }
        else
        {
            System.out.println(str1);
        }


    }
}
