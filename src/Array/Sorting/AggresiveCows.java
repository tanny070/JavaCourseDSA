package Array.Sorting;
import java.util.*;
public class AggresiveCows {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int testcase=scanner.nextInt();
		
		while(testcase>0) 
		{
			int nos=scanner.nextInt();
			int noc=scanner.nextInt();
			
			int[] stall=new int[nos];
			
			for (int i = 0; i < stall.length; i++) {
				stall[i]=scanner.nextInt();
			}
			
			Arrays.sort(stall);
			
			System.out.println(maxDistance(stall, noc));
			
			
			
			testcase--;
			
			
			
			
		}
		
		
		

	}
	
	public static int maxDistance(int[] stall,int noc) 
	{
		int low=stall[0];
		int high=stall[stall.length-1];
		int ans=0;
		
		while(low<=high) 
		{
			int mid=(low+high)/2;
			if(isSafe(stall,noc,mid)  == true)
			{
				ans=mid;
				low=mid+1;
			}
			else 
			{
				high=mid-1;
			}
		}
		return ans;
	}
	
	
	public static boolean isSafe(int stall[],int noc,int mid) 
	{
		int cow=1;
		int pos=stall[0];
		for (int i = 0; i < stall.length; i++) {
			
			if(stall[i]-pos>=mid) 
			{
				cow++;
				pos=stall[i];
			}
			
			if(cow == noc) 
			{
				return true;
			}
			
		}
		return false;
	}

}
