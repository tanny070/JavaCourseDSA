package Array.Assignment3;
import java.util.*;

public class SortZeroesAndOnes
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];

        if(n>=1 && n<=Math.pow(10,6))
        {
            for (int i = 0; i < arr.length; i++)
            {
                arr[i]=scanner.nextInt();
            }

            SortArray(arr);
            printArray(arr);

        }


    }

    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");

        }
    }

    public static void SortArray(int[] arr)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        int temp=0;

        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low=low+1;
                    mid=mid+1;
                    break;

                case 1:
                    mid=mid+1;
                    break;
// In case of 0 and 1 only skip this case, this case is only used when element is 0,1,2
                case 2:
                    temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high=high-1;
                    break;

            }
        }
    }


}
