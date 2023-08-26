package Array.Sorting;

public class SelectionSort {

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
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public static void sort(int arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j]<arr[minIndex]) 
				{
					minIndex=j;;
				}
			}
			swap(arr,i,minIndex);
		}
	}
	
	
	public static void swap(int arr[],int i,int j) 
	{
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
