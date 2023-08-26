package Pattern;
import java.util.*;
public class DragonPattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value on num");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) 
		{
			int point=1;
			int spaceCount=i*2;
			
			while(point<=spaceCount) 
			{
				System.out.print("  ");
				point++;
			}
			
			for(int j=n;j>i;j--) 
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
		
	}

}
