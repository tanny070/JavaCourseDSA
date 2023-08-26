package Array.Sorting;

public class Binary_Search {

	public static void main(String[] args) {
		
		int[] arr= {2,3,5,6,7,11,13,15,18,19,20};
		int item=13;
		
		System.out.println(Search(arr, item));
		
		

	}
	
	
	public static int Search(int arr[],int item) 
	{
		int lo=0;
		int high=arr.length-1;
		
		while(lo<=high) 
		{
			int mid=(lo+high)/2;
			
			if(arr[mid] == item) 
			{
				return mid;
			}
			else if(arr[mid]>item) 
			{
				high=mid-1;
			}
			else 
			{
				lo=mid+1;
			}
		}
		
		return -1;
	}
	
	

}
