package Pattern;
import java.util.Scanner;

public class MountainPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		
		int countSpace=5;
		if(n>0 && n<10) 
		{
			for(int i=1;i<=n;i++) 
			{
				for(int j=1;j<=i;j++) 
				{
					System.out.print(j+"	");
				}
				
				for(int k=1;k<=countSpace;k++) 
				{
					System.out.print("	");
				}
				countSpace=countSpace-2;
				for(int l=i;l>=1;l--) 
				{
					if(i==n && l==n)
						continue;
					else 
					{
						System.out.print(l+"	");
					}
				}
				System.out.println();
			}
		}
		

	}

}
