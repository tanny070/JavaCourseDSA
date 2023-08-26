package Pattern;

public class Pattern4 
{
	public static void main(String args[]) 
	{
		for(int i=0;i<5;i++) 
		{
			int n=i+1;
			for(int k=5;k>k-n;k--) 
			{
				System.out.print("  ");
			}
			
			for (int j=0;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
