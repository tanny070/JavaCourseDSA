
package Pattern;
import java.util.*;
public class PatternMagic {

	public static void main(String args[])  
	{   
	
	int num=new Scanner(System.in).nextInt();
	//logic to print the first half pattern   
	for(int i=1; i<=num; i++)  
	{  
	for(int j=1; j<=num-i+1; j++)  
	{
		if(i==1 && j==num) 
		{
			
		}
		else 
		{
			System.out.print("*"); 
		}
	 
	}   
	//loop calculates space  
	for(int k=1; k<=2*i-3; k++)  
	{  
	System.out.print(" ");  
	}   
	for(int j=1; j<=num-i+1; j++)  
	{  
	System.out.print("*");  
	}   
	System.out.println();  
	}  
	//logic to print the second half pattern   
	for(int i=num-1; i>=1; i--)  
	{  
	for(int j=i; j<=num; j++)  
	{  
	System.out.print("*");  
	}   
	//loop calculates space  
	for(int k=1; k<=(2*i)-3; k++)  
	{  
	System.out.print(" ");  
	}   
	for(int j=i; j<=num; j++)  
	{
		if(i==1 && j==num) {}
		else 
		{
			System.out.print("*");
			
		}
	  
	}   
	System.out.println();  
	}  
	}

}
