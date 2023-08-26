package Array.Assignment3;

import java.util.*;

public class CalculateTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];		
		if(n>=1 && n<=Math.pow(10, 5)) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				int item=scanner.nextInt();
				
				if(item>=1 && item<=Math.pow(10, 9)) 
				{
					arr[j]=item;
				}
				
			}
			
			int q=scanner.nextInt();
			
			if(q>=1 && q<=Math.pow(10, 6)) 
			{
				for (int i = 0; i < q; i++) 
				{
					int x=scanner.nextInt();
					
					if(x>=0 && x<n) 
					{
						sumArray(arr,x);
						
					}
					
				}
			}
			scanner.close();
			
			System.out.println(finalResult(arr));
			
		}

	}
	
	public static void sumArray(int arr[],int x) 
	{
		int size=arr.length;
		int arrIntermediate[]=new int[size];
		for (int i = 0; i < size; i++) 
		{
			
			int sumIndex=0;
			if((i-x)<0) 
			{
				sumIndex=size+(i-x);
				arrIntermediate[i]=arr[sumIndex];
			}
			else 
			{
				sumIndex=i-x;
				arrIntermediate[i]=arr[sumIndex];
			}
			
			
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=arrIntermediate[i];
		}
	}
	
	public static int finalResult(int arr[]) 
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum+=arr[i];
			
		}
		
		int modulus=(int)(sum%(Math.pow(10, 9)+7));
		return modulus;
	}

}
