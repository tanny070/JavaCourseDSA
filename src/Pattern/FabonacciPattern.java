package Pattern;
import java.util.Scanner;
public class FabonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=new Scanner(System.in).nextInt();
		int fact=1;
		int previous=0;
		
		if(n>0 && n<100) {
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				if(i==1) 
				{
					System.out.print(previous);
				}
				else if(i==2 && j==1) 
				{
					System.out.print(fact+"	");
				}
				else 
				{
					int interchange=previous;

					previous=fact;
					fact+=interchange;
					System.out.print(fact+"	");
					
				}
				
			}
			System.out.println();
			
		}
		}

	}

}
