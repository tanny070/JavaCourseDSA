package Pattern;
import java.util.Scanner;
public class MirrorStarPattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		
		
		if(n>0 && n<10 && n%2!=0) 
		{
			//printing first half
			
			int mid=(n/2)+1;
			int count=0;
			
			
			for(int i=1;i<mid;i++) 
			{
				for(int j=mid;j>i;j--) 
				{
					System.out.print("	");
				}
				for(int k=1;k<=i+count;k++) 
				{
					System.out.print("*	");
				}
				count++;
				System.out.println();
			}
			
			for(int i=1;i<=n;i++) 
			{
				System.out.print("*	");
			}
			
			System.out.println();
			
			
			//printing secondhalf
			int count2=1;
			for(int i=1;i<mid;i++) 
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print("	");
				}
				for(int k=1;k<=(n-i)-count2;k++) 
				{
					System.out.print("*	");
				}
				count2++;
				System.out.println();
			}
			
			
		}

}
}
