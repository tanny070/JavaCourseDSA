package Array.Sorting;

public class InsertionSort {

	public static void main(String[] args) {
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
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void sort(int arr[]) 
	{
		for(int i=1;i<arr.length;i++) 
		{
			int j=i-1;
			int picked=arr[i];
			
			while(j>=0 && arr[j]>picked) 
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=picked;
		}
	}
	
	
	
}
