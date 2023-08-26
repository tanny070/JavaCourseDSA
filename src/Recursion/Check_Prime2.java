package Recursion;

public class Check_Prime2
{
    public static void main(String[] args)
    {
        System.out.println(IsPrime(2));

    }

    public static boolean IsPrime(int n)
    {
        int div=2;
        while(div*div <= n)
        {

            if(n%div == 0)
            {

                return false;
            }
            div++;
        }
        return true;
    }
}
