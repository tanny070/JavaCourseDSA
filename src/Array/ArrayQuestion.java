package Array;
import java.util.*;

public class ArrayQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();

		System.out.println(kthRoot(n,k));
		
		

	}
	
	public static int kthRoot(int n,int k) 
	{
		int low=1;
		int hi=n;
		int ans=0;
		
		while(low <=hi)
		{
			int mid=(low+hi)/2;
			if(Math.pow(mid, k)<=n) 
			{
				ans=mid;
				low=mid+1;
				
			}
			else 
			{
				hi=mid-1;
			}
		}
		return ans;
		
		
	}

}
