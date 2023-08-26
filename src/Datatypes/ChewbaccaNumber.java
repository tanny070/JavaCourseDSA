package Datatypes;
import java.util.*;

public class ChewbaccaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		
		if(n<Long.MAX_VALUE) 
		{
			long d=0;
			long rev=0;
			long m=0;
			
			while(n!=0) 
			{
				d=n%10;
				m=m*10+d;
				n=n/10;
				
			}
			
			int flag=0;
			
			while(m>0) 
			{
				d=m%10;
				
				long d1=9-d;
				if(d==9 && flag==0) 
				{
					d=9;
					flag=1;
				}
				
				else 
				{
					if(d1<d) 
					{
						d=d1;
					}
				}
				rev=rev*10+d;
				m=m/10;
				
			}
			System.out.print(rev);
		}
		

	}

}
