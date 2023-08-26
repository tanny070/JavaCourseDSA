package Array;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class AlexGoesShopping
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int priceOfItems[]=new int[n];

        if(n>=1)
        {
            for (int i = 0; i < priceOfItems.length; i++)
            {
                priceOfItems[i]=sc.nextInt();

            }
            Arrays.sort(priceOfItems);
            int queries= sc.nextInt();
            if(queries>=1 && queries<=2*n)
            {
                while(queries>0){
                int a=sc.nextInt();
                int k=sc.nextInt();
                CheckQuery(priceOfItems,a,k);
                queries--;
                }
            }
        }

    }

    public static void CheckQuery(int priceOfItems[],int a,int k)
    {
        int count=0;
        for (int i = 0; i < priceOfItems.length; i++)
        {
            if(a%priceOfItems[i]==0)
            {
                count++;
            }

        }

        if(count==k)
        {
            System.out.println("Yes");

        }
        else
        {
            System.out.println("No");
        }

    }
}
