package Datatypes;

public class OctalToDecimal 
{
	public static void main(String args[]) 
	{
		int n=345;
		int sum=0;
		int mul=1;
		
		while(n>0) 
		{
			int rem = n%10;
			sum = sum+rem*mul;
			n=n/10;
			mul=mul*8;
		}
		System.out.println(sum);
	}
	

}
