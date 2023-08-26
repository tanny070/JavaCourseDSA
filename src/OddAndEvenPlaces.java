import java.util.*;
public class OddAndEvenPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=new Scanner(System.in).nextInt();
		
		
		
		
		int oddSum=0;
		int evenSum=0;
		int count=1;
		if(num>0 && num<=1000000000) 
		{
			int reverse=0;
			int leftNumber2=num;
			
			while(leftNumber2>0) 
			{
				reverse=(reverse*10)+leftNumber2%10;
				leftNumber2=leftNumber2/10;
			}
			
			System.out.println("reverse"+reverse);
			
			
			int leftNumber=reverse;
			while(leftNumber>0) 
			{
				
				int digit=leftNumber%10;
				leftNumber=leftNumber/10;
				System.out.println("leftNumber"+digit);
				if(count%2==0) 
				{
					evenSum+=digit;
				}
				else 
				{
					oddSum+=digit;
				}
				count++;
			}
			
			System.out.println(evenSum);
			System.out.println(oddSum);
			
		}
	}

}
