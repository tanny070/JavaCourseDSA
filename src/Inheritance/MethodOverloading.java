package Inheritance;

public class MethodOverloading
{
    public static int add(int a,int b)
    {
        return a+b;
    }

    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public static int add(float a,int b,int c)
    {
        return (int)a+b+c;
    }

    public static int add(int... a)
    {
        int sum=0;
        for (int i = 0; i < a.length; i++)
        {
            sum+= a[i];

        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));

        System.out.println(add(2,3,4,5,6,7,8,9));
    }
}
