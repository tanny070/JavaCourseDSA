package Pattern;

import java.util.Scanner;

public class InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=new Scanner(System.in).nextInt();
		
		for(int i=(rows*2);i>=0;i--) 
		{
			int count=rows;
			
			for(int k=5-i;k>=rows;k--) 
			{
				if(count<0)
					break;
				System.out.print(k);
				System.out.print(" ");
				
			}
			System.out.println();
			/*
			for(int k=1;k<=rows-i;k++) 
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=(i*2)+1;j++) 
			{
			
				System.out.print(count);
				System.out.print(" ");
				if(j>=i+1) 
				{
					count++;
				}
				else 
				{
					count--;
				}
			}
			System.out.println();
			
			*/
		}
		
		
		
		

	}


}
