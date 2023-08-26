import java.util.*;
public class ReplaceWithFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=new Scanner(System.in).nextInt();
		
		if(num>0 && num<=1000000000) 
		{
			int reverse=0;
			int reverse2=0;
			int leftNumber2=num;
			
			while(leftNumber2>0) 
			{
				int remainder=leftNumber2%10;
				if(remainder!=0) {
				reverse=(reverse*10)+remainder;
				}
				else 
				{
					reverse=(reverse*10)+5;
				}
				leftNumber2=leftNumber2/10;
			}
			int leftNumber=reverse;
			while(leftNumber>0) 
			{
				int remainder=leftNumber%10;
				if(remainder!=0) {
				reverse2=(reverse2*10)+remainder;
				}
				else 
				{
					reverse2=(reverse2*10)+5;
				}
				leftNumber=leftNumber/10;
			}
			
			System.out.println(reverse2);
		}
	}

}
