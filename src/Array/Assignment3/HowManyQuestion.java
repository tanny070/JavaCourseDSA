package Array.Assignment3;
import java.util.*;

public class HowManyQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int no_0f_responses=3;
		int totalMatch=0;
		int arr[]=new int[3];
		if(n>=1 && n<=1000) 
		{
			while(n>0) 
			{
				for(int i=0;i<no_0f_responses;i++) 
				{
					arr[i]=scanner.nextInt();
				}
				
				if(countResponse(arr)>1) 
				{
					totalMatch++;
				}
			
				n--;
				
			}
			
			System.out.println(totalMatch);
		}
		
		

	}
	
	public static int countResponse(int arr[]) 
	{
		int count=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==1) 
			{
				count++;
			}
			
		}
		return count;
	}
	
	 

}
