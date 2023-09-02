package Basic;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hey");
		int a=6;
		int b=9;
		add(a,b);
		System.out.println("bye");
	}
	
	public static void add(int a,int b) 
	{
		int c=a+b;
		sub(a,c);
		System.out.println(c);
	}
	
	public static void sub(int a,int c) 
	{
		int result=a-c;
		System.out.println(result);
		
	}

}
