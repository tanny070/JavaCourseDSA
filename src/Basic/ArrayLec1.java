package Basic;

import java.util.Scanner;
public class ArrayLec1 
{
	public static void main(String args[]) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//C type declaration
		int arr[]=new int[n];
		
		//java type declaration
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		printArray(arr);
	}
	
	public static void printArray(int[] arr) 
	{
		System.out.println("Printing Arrayz");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		
	}

}
