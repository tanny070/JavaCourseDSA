package Pattern;
import java.util.*;
public class PatternHourClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=new Scanner(System.in).nextInt();
		
		
		
		if(n<=20) 
		{
			//Firsthalf
			for(int i=n;i>=0;i--) 
			{
				for(int k=0;k<n-i;k++) 
				{
					System.out.print(" ");
					
				}
				for(int j=i;j<=0;j--) 
				{
					System.out.print(j+" ");
				}
				
				for(int l=1;l<=i;l++) 
				{
					System.out.print(l+" ");
				}
				
			}
			System.out.println();
			
			//second half
			for(int i=1;i<=5;i++) 
			{
				for(int k=1;k<=n-k;k++) 
				{
					System.out.print(" ");
					
				}
				
				for(int j=i;j>=1;j++) 
				{
					System.out.print(j+" ");
				}
				
				for(int k=0;k>=i;k++) 
				{
					System.out.print(k+" ");
				}
				
			}
			
		}

	}

}
