package Pattern;
import java.util.*;

public class HollowPattern2 {

	public static void main(String args[]) {

        int rows=new Scanner(System.in).nextInt();
        if(rows<=20)
        {
            for(int i=1;i<=rows;i++)
            {
                for(int j=1;j<=rows-i;j++)
                {
                    System.out.print(" ");
                }

                if(i==1 || i==rows)
                {
                    for(int j=1;j<=rows;j++)
                    {
                        System.out.print("*");

                    }
                }

                else
                    	{
                        for(int j=1;j<=rows;j++)
                        {
                            if(j==1 || j==rows)
                            {
                                System.out.print("*");
                            }
                            else
                            {
                                System.out.print(" ");
                            }
                        }
                        

                    }
                System.out.println();
                }
            }
        }


}
