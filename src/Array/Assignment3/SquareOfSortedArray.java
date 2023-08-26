package Array.Assignment3;
import java.util.*;

public class SquareOfSortedArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		if(n>=1 && n<= Math.pow(10, 4)) 
		{
			
			
			for (int i = 0; i < arr.length; i++) 
			{
				arr[i]=sc.nextInt();
				
			}
			
		}
		
		SortAndSquare(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}
	
	public static void SortAndSquare(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int minIndex=i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(Math.pow(arr[minIndex], 2)>Math.pow(arr[j], 2)) 
				{
					minIndex=j;
				}
			}
			
			int temp=(int)Math.pow(arr[minIndex], 2);
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
			
		}
	}
	
	

}
