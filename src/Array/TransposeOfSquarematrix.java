package Array;
import java.util.*;
public class TransposeOfSquarematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int [][]arr=new int[n][n];
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{

				arr[i][j]=scanner.nextInt();
			}
			
		}
		
		transpose(arr);
		printArray(arr);
		
		
				

	}
	
	public static void printArray(int[][] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
	
	public static void transpose(int arr[][]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
				
			}
			
		}
	}

}
