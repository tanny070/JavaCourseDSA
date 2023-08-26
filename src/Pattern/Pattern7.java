package Pattern;
import java.util.*;
public class Pattern7 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row count");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<row;j++) 
			{
				if(i==0 || i==row-1) 
				{
					System.out.print("* ");
				}
				else if(j==0 || j==row-1) 
				{
					System.out.print("* ");
					
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
