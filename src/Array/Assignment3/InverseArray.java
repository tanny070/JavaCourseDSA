package Array.Assignment3;
import java.util.*;

public class InverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] invarr=new int[n];
		
		
		if(n>=0) {
		for (int j = 0; j < arr.length; j++) {
			arr[j]=sc.nextInt();
		}
		sc.close();
		
		
		InverseArrayValue(arr,invarr,0);
		
		
		for (int j2 = 0; j2 < invarr.length; j2++) {
			System.out.print(invarr[j2]+" ");
		}
		}

	}
	
	public static void InverseArrayValue(int arr[],int invarr[],int i) 
	{
		
		if(i>=arr.length)
			return;
		
		int temp=arr[i];
		invarr[temp]=i;
		
		
			
		InverseArrayValue(arr,invarr,i+1);
			
	}

}
