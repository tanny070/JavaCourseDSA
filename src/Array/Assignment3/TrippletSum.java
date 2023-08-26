package Array.Assignment3;
import java.util.*;
public class TrippletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>=1 && n<=1000) {
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
			
		}
		int sum=sc.nextInt();
		
		SortArray(arr);
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			int l=i+1;
			int r=n-1;
			int x=arr[i];
			
			while(l<r) {
			if(x+arr[l]+arr[r] == sum) 
			{
				System.out.println(x+", "+arr[l]+" and "+arr[r]);
				l++;
				r--;
			}
			else if(x+arr[l]+arr[r]<sum) 
			{
				l++;
			}
			else 
			{
				r--;
			}
			
		}
		}
		
		}
		
		
	}
	
	public static void SortArray(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int minIndex=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minIndex]) 
				{
					minIndex=j;
				}
			}
			swapArrayElement(arr,minIndex,i);
			
		}
	}
	
	public static void swapArrayElement(int[] arr,int i,int j) 
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
