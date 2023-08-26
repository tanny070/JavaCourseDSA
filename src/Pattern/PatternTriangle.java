package Pattern;
import java.util.*;

public class PatternTriangle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=new Scanner(System.in).nextInt();
		int count=0;
		int count2=0;
		
		if(num>0 && num<10) {
		for(int i=1;i<=num;i++) 
		{
			for(int j=num-1;j>=i;j--) 
			{
				System.out.print("	");
			}
			for(int j=i;j<=i+count;j++) 
			{
				System.out.print(j+"	");
			}
			
			if(i==1) 
			{
				System.out.print("	");
			}
			else 
			{
				for(int j=i+count2;j>=i;j--) 
				{
					System.out.print(j+"	");
				}

				count2++;
			}
			
			
			System.out.println();
			count++;
		}
		}

	}

}
