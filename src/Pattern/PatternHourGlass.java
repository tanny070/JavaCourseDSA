package Pattern;
import java.util.*;

public class PatternHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=new Scanner(System.in).nextInt();
		
		for(int i=rows;i>=0;i--) 
		{
			int count=i;
			
			for(int k=1;k<=rows-i;k++) 
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=(i*2)+1;j++) 
			{
			
				System.out.print(count);
				System.out.print(" ");
				if(j>=i+1) 
				{
					count++;
				}
				else 
				{
					count--;
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=rows;i++) 
		{
			int count=i;
			
			for(int k=i;k<rows;k++) 
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=(i*2)+1;j++) 
			{
				System.out.print(count);
				System.out.print(" ");
				if(j>=i+1) 
				{
					count++;
				}
				else 
				{
					count--;
				}
			}
			System.out.println();
			
			
		}
		
		

	}

}
