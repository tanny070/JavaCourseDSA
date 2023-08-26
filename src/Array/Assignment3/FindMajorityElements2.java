package Array.Assignment3;
import java.util.*;

public class FindMajorityElements2
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];

        if(n>=1 && n<=Math.pow(10, 7))
        {
            for (int i = 0; i < arr.length; i++)
            {
                int item= scanner.nextInt();
                if(item>=0 && item<=Math.pow(10,9))
                {
                    arr[i]=item;

                }
            }

            Arrays.sort(arr);
            majorityElement(arr, arr.length);

        }
    }

    public static void majorityElement(int arr[],int n)
    {
        int i=0;
        int j=i+1;
        int count=1;
        int limit=Math.floorDiv(n,3);
        System.out.println("limit "+limit);


        while(j<n)
        {
            if(n == 1)
            {
                break;
            }
            if(arr[i] == arr[j])
            {
                count++;
                j++;
            }
            else
            {
                if(count>limit)
                {
                    System.out.print(arr[i]+" ");
                }
                i=j;
                j++;
                count=1;
            }

        }

    }
}
