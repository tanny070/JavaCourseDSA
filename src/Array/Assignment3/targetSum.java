package Array.Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class targetSum {

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
		Arrays.sort(arr);

		for(int i=0;i<n;i++)
		{
			for (int j = i+1; j < n; j++)
			{
				if(arr[i]+arr[j] == sum)
				{
					System.out.println(arr[i]+"and "+arr[j]);
				}

			}
		}

		}
		
		
	}
	


}
