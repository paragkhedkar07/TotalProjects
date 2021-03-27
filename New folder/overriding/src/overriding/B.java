package overriding;

public class B extends A 
{
@Override

	public A m1() 
	{
		
		System.out.println("m1 of b");
		
		return null;
	}
	
	public static void main(String args[])
	{

	 B a=new B();
	   a.m1();
	
	
	
	}
}
