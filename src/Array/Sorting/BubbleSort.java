package Array.Sorting;

public class BubbleSort 
{
	public static void main(String args[]) 
	{
		int arr[]= {12,5,13,16,8,6};
		printArray(arr);
		
		sort(arr);
		System.out.println("After sort");
		printArray(arr);
		
		
		
	}
	
	public static void printArray(int arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public static void sort(int arr[]) 
	{
		for(int i=1;i<arr.length;i++) 
		{
			for(int j=0;j<arr.length-i;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int arr[],int i,int j) 
	{
		arr[j]=arr[i]+arr[j];
		arr[i]=arr[j]-arr[i];
		arr[j]=arr[j]-arr[i];
	}

}
