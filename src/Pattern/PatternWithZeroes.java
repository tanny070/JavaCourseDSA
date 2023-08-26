package Pattern;
import java.util.*;

public class PatternWithZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=new Scanner(System.in).nextInt();
		
		if(num>0 && num<100) {
		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				if(j==1 || j==i) 
				{
					System.out.print(i);
				}
				else 
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}
	}

}
