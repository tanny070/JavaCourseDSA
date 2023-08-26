package Array;
import java.util.*;

public class TwoDArrayInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		
		int[][] arr=new int[n][m];
		
		for (int i = 0; i < arr.length; i++) 
		{
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
