package Pattern;
import java.util.*;
public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=new Scanner(System.in).nextInt();
		
		if(n>0 && n<10) 
		{
			for(int i=1;i<=n;i++) 
			{
				for(int j=1;j<=i;j++) {
					System.out.print(j+"	");
				}
				for(int k=1;k<=n-i;k++) 
				{
					System.out.print("	");
				}
			}
		}

	}

}
