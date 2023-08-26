package Array.Assignment3;
import java.util.*;

public class WaterMelonSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		String reString="NO";
		
		if(n>=1 && n<= Math.pow(10, 5)) 
		{
			int i=2;
			int j=(n%2==0)?n-2:n-1;
			
			while(i<=j) 
			{
				int sum=i+j;
				
				if(sum==n) 
				{
					reString="YES";
					break;
					
				}
				else if(sum>n) 
				{
					j-=2;
					
				}
				else 
				{
					i+=2;
				}
				
			}
			
			System.out.println(reString);
			
		}

	}

}
