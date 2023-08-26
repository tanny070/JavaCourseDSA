package Array.Assignment3;
import java.security.PublicKey;
import java.util.*;

public class SortingLinearTime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		if(n>=1 && n<=Math.pow(10, 6)) 
		{
			int arr[]=new int[n];
			int i=1;
			while(i<=n) 
			{
				int item=scanner.nextInt();
				if(item>=0 && item<=2) 
				{
					arr[i]=item;
					i++;
				}
			}
			
			sort(arr);
			printArray(arr);
			
			}
		}
			
			public static void sort(int arr[]) 
			{
				int lo=0;
				int hi=arr.length-1;
				int mid=0;
				int temp=0;
				
				
				while(mid<=hi) 
				{
					switch(arr[mid]) 
					{
					case 0:
					{
						temp=arr[mid];
						arr[lo]=arr[mid];
						arr[mid]=temp;
						mid++;
						lo++;
						break;
					}
					
					case 1:
					{
						mid++;
						break;
					}
					
					case 2:
					{
						temp=arr[mid];
						arr[mid]=arr[hi];
						arr[hi]=temp;
						hi--;
						break;
						
					}
					
					   
					
					
					}
				}
			}
			
			public static void printArray(int arr[]) 
			{
				for (int j = 0; j < arr.length; j++) 
				{
					System.out.println(arr[j]);
					
				}
			}
			}