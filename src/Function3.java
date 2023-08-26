
public class Function3 {
	static int val=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hey");
		int a=5;
		System.out.println(val);
		System.out.println(add(a,45));
		System.out.println("Bye");
		System.out.println(val);

	}
	
	public static int add(int a,int c) 
	{
		int x=a+c;
		System.out.println(c);
		val+=5;
		
		//Accessing global variable
		System.out.println(Function3.val);
		return x-3;
	}

}
