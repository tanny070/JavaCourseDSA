package Datatypes;
import java.util.*;

public class BostonNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(sumOfDigits(num)==sumOfPrimeFactors(num)) 
		{
			System.out.print(1);
		}
		else 
		{
			System.out.print(0);
			
		}
		

	}
	
	public static int sumOfDigits(int n) 
	{
		int sum=0;
		while(n>0) 
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
			
		}
		return sum;
	}
	
	public static int sumOfPrimeFactors(int n) 
	{
		int sum=0;
		while(n%2==0) 
		{
			sum+=2;
			n/=2;
		}
		
		for (int i = 3; i <= Math.sqrt(n); i+=2) 
		{
			while(n%i==0) 
			{
				sum+=i;
				n/=i;
			}
			
		}
		
		if(n>2) 
		{
			sum+=n;
		}
		return sum;
	}

}
