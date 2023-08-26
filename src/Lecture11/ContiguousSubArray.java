package Lecture11;

import java.util.Iterator;

public class ContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSum(arr));
		

	}
	

	
	public static int maxSum(int[] arr) 
	{
		int ans=Integer.MIN_VALUE;
		
	    for (int i = 0; i < arr.length; i++) {
	    	int previousSum=0;
			for (int j = i; j < arr.length; j++) {
				
				previousSum+=arr[j];
				ans=Math.max(ans, previousSum);
			}
		}
	    return ans;
	}

}
