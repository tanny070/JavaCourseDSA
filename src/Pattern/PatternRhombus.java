package Pattern;
import java.util.*;
public class PatternRhombus {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=-1;
		
		if(n>0 && n<10) 
		{
			for(int i=1;i<=n;i++) 
			{
			     for (int j =1; j <= n-1; j++) 
			     {
			    	 System.out.print(" "+"	");
			     }
			     
			     count++;		
			     
			     for (int j = 1; j <= count; j++) 
			     {
			    	 if(j<=i) 
			    	 {
			    		 
			    	 }
			    	 
					
				 }
			}
		}

	}

}
