import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=new Scanner(System.in).nextInt();
		int digit=new Scanner(System.in).nextInt();
		int count=0;
		
		int intermediateValue=number;
		
		if(number>=0 && number<=Integer.MAX_VALUE && digit>=0 && digit<=9) 
		{
			while(intermediateValue>0) {
				
				int digitValue=intermediateValue%10;
				if(digitValue==digit) 
				{
					count++;
				}
				intermediateValue=intermediateValue/10;

				
			}
			
			System.out.println(count);
			
		}
	}

}
