package String;

import java.util.Scanner;

public class FindCBNumbers
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=new Scanner(System.in).nextLine();
        printSubString(str);
    }


    public static void printSubString(String str)
    {
        int count=0;
        boolean[] visited=new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++)
        {
            for (int j = len; j <= str.length() ; j++)
            {
                int i=j-len;

                String digitNum=str.substring(i,j);
                if(IsCbNumber(Long.parseLong(digitNum)) && isVisited(visited,i,j-1))
                {
                    count++;
                    for (int k = i; k < j ; k++)
                    {
                        visited[k] = true;

                    }
                }


            }

        }
        System.out.println(count);

    }

    public static boolean isVisited(boolean[] visited, int si, int ei)
    {
        for (int i = si; i <=ei ; i++)
        {
            if(visited[i])
            {
                return false;
            }

        }
        return true;
    }

    public static boolean IsCbNumber(long num)
    {
        if(num == 0 || num == 1)
        {
            return false;
        }
        int[] cb={2,3,5,7,11,13,17,19,23,29};
        for (int i = 0; i < cb.length; i++)
        {
            if(num == cb[i])
            {
                return true;
            }

        }

        for (int i = 0; i < cb.length; i++)
        {
            if(num%cb[i] == 0 )
            {
                return false;
            }

        }

        return true;
    }
}
