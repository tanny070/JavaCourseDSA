package Array;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]={1,2,3,4,5,6};
		rotate2(nums,3);
	}
		
		public static void rotate2(int[] nums, int k) 
		{
		       
					 int rotate=k%nums.length;


					 while(rotate>0)
					 {
						 int temp=nums[nums.length-1];
						 for(int i=nums.length-2;i>=0;i--)
						 {
							 nums[i+1]=nums[i];
						 }
						 nums[0]=temp;
						 rotate--;
					 }
		

		

	}

}
