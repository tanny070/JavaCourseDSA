package Array;

public class SwapProg {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		int arr[]= {1,34,56,78,90};
		int[] other= {11,33,55,77,90};
		System.out.println(arr[0]+" "+arr[1]);
		swap(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]);
		swap2(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);
		swap3(arr,other);
		System.out.println("after array swap");
		System.out.println(arr[0]+" "+arr[1]);
		

	}
	
	public static void swap(int a , int b) 
	{
		
		//first way
		int temp=a;
		a=b;
		b=temp;
		
		//second way
		
		a=a+b;
		b=a-b;
		a=a-b;
	}
	
	public static void swap2(int[] arr, int i, int j) 
	{
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}
	
	public static void swap3(int[] arr, int[] other) 
	{
		
		int[] temp=arr;
		arr=other;
		other=temp;
		
		
	}

}
