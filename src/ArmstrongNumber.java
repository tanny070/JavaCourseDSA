import java.util.*;
public class ArmstrongNumber {

	public static void main(String args[]) {
		int num=new Scanner(System.in).nextInt();
		System.out.println(isArmstrong(num));

    }

	public static boolean isArmstrong(int num)
	{
		int digit=0;

		int intermediate=num;

		while(intermediate>0)
		{
			intermediate=intermediate/10;
			digit++;
		}
		
		int sum=0;
		
		int intermediate2=num;
		while(intermediate2>0) 
		{
			
			int remainder=intermediate2%10;
			intermediate2/=10;
			
				sum+=(int)Math.pow(remainder, digit);
			
			
			
		
		}
		
		if(sum==num) 
		{
			return true;
		}
		else 
		{
			return false;
		}
				

	}

}
