import java.util.Random;

public class Random_Number
{
    public static void main(String[] args)
    {
        int si=10;
        int ei=100;

        Random r=new Random();
        for (int i = 0; i < 10; i++)
        {
            int item=r.nextInt(ei-si+1);
            System.out.println(item+" ");


        }

    }
}
