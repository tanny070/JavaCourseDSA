package Array;

public class RotateArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]={1,2,3,4,5,6};
		rotate2(nums,3);
	}
		
		public static void rotate2(int[] nums, int k) 
		{
			//reverse last half
			int n=nums.length;
			reverseArrayRange(nums,0,n-k-1);
			reverseArrayRange(nums,n-k,n-1);
			reverseArrayRange(nums,0,n-1);
		}
		
		public static void reverseArrayRange(int arr[],int minRange,int maxRange) 
		{
			int i=minRange;
			int j=maxRange;
			
			while(i<j) 
			{
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
				i++;
				j--;
			}
		}


}
