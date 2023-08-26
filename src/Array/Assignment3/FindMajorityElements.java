package Array.Assignment3;
import java.util.*;
public class FindMajorityElements {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		if(n>=1 && n<=Math.pow(10, 7))
		{
			for (int i = 0; i < arr.length; i++)
			{
				int item= scanner.nextInt();
				if(item>=0 && item<=Math.pow(10,9))
				{
					arr[i]=item;
				}

			}

			Arrays.sort(arr);

			int i=0;
			int count=0;

			while(i< arr.length)
			{
				count++;
				if(count> Math.floorDiv(arr.length, 3))
				{
					System.out.print(arr[i]+" ");
				}
				int nextIndex=(i>=arr.length-1)?i:(i+1);
				if( arr[i] != arr[nextIndex])
				{
					count=0;
				}
				i++;
			}
		}

	}
}
