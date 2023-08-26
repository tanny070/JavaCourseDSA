package Array.Assignment3;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int testCase=scanner.nextInt();
		if(testCase>=1 && testCase<=100) 
		{
			while(testCase>0) 
			{
				int n=scanner.nextInt();
				int arr[]=new int[n];
				
				if(n>=1 && n<=1000) 
				{
					for (int i = 0; i < arr.length; i++) {
						int item=scanner.nextInt();
						
						if(item<=10000) 
						{
							arr[i]=item;
						}
					}
				}
				
				System.out.println(sumArray(arr));
				
				testCase--;
			}
		}
		
	}
	
	public static int sumArray(int arr[]) 
	{
		int size=arr.length;
		int sum=0;
		for (int i = 0; i < size-2; i++) 
		{
			int sumIndex=0;
			if(i==0) 
			{
				
				sumIndex=size-1;
				System.out.println("index with: i "+i+" sumIndex: "+sumIndex+"Adding values("+arr[i]+"+"+arr[sumIndex]+")");
				sum=sum+arr[sumIndex]+arr[i];
			}
			
			else if(i%2!=0) {
			
			if((i+1)>(size-1)) 
			{
				sumIndex=(i+1)-size;
				System.out.println("index with: i "+i+" sumIndex: "+sumIndex+"Adding values("+arr[i]+"+"+arr[sumIndex]+")");
				sum=sum+arr[sumIndex]+arr[i];
			}
			else 
			{
				sumIndex=i+1;
				System.out.println("index with: i "+i+" sumIndex: "+sumIndex+"Adding values("+arr[i]+"+"+arr[sumIndex]+")");
				sum=sum+arr[sumIndex]+arr[i];
			}
			}
			
			
			
		}
		return sum;
		
	}
	
	

}
