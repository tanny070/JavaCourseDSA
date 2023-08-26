package Array;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,34,56,78,11,-7,90};
		int num=new Scanner(System.in).nextInt();
		System.out.println(isNumberExists(arr,num));
		System.out.println("Greatest Value: "+greatestValue(arr));
		System.out.println("Greatest Value2: "+greatestValue2(arr));
		reverseArray(arr);
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		
		
		
		int minRange=new Scanner(System.in).nextInt();
		int maxRange=new Scanner(System.in).nextInt();
		int arr2[]= {1,2,3,4,5,6,7,8,9};
		reverseArrayRange(arr2,minRange,maxRange);
		for(int i=0;i<arr2.length;i++) 
		{
			System.out.println(arr2[i]);
		}
		

	}
	
	public static int isNumberExists(int arr[],int num) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==num) 
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int greatestValue(int arr[]) 
	{
		int largestNum=arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>largestNum)
				largestNum=arr[i];
			
		}
		return largestNum;
	}
	
	public static int greatestValue2(int arr[]) 
	{
		int largestNum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>largestNum)
				largestNum=arr[i];
			
		}
		return largestNum;
	}
	
	public static void reverseArray(int arr[]) 
	{
		int i=0;
		int j=arr.length-1;
		
		while(i<j) 
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;
		}
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
