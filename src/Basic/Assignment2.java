package Basic;

import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
		int num=new Scanner(System.in).nextInt();
		if(num>2 && num<=1000000000) 
		{
			for(int i=2;i<=num/2;i++) 
			{
				if(num%i==0) 
				{
					isPrime=false;
				}
			}
			
			if(isPrime) 
			{
				System.out.print("Prime");
			}
			else 
			{
				System.out.print("Not Prime");
				
			}
			
			
		}
		
	}
	}
		
