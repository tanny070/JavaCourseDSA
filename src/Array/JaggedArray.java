package Array;
import java.util.*;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		
		int[][] arr=new int[n][];
		
		for (int i = 0; i < arr.length; i++) 
		{
			int m=scanner.nextInt();
			arr[i]=new int[m];
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j]=scanner.nextInt();
				
			}
			
		}
		
		
		//print
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			
		}
		

	}

}
