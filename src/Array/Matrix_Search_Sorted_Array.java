package Array;

import java.util.*;

public class Matrix_Search_Sorted_Array
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] arr=new int[n][m];

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j]=scanner.nextInt();

            }

        }

        int x=scanner.nextInt();

        System.out.println(Search(arr,x));


    }

    public static int Search(int arr[][],int x)
    {
        int row=0;
        int col=arr[0].length-1;

        while(row<arr.length && col>=0)
        {
            if(arr[row][col] == x)
            {
                return 1;
            }
            else if(arr[row][col] > x)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return 0;
    }
}
