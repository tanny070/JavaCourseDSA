
public class Function2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a=6;
		int b=9;
		System.out.println(add(a,b));
		System.out.println("bye");
	}
	
	public static int add(int a,int b) 
	{
		int c=a+b;
		
		System.out.println(sub(a,c));
		return c;
	}
	
	public static int sub(int a,int c) 
	{
		int result=a-c;
		return result;
		
		
	}


	

}
