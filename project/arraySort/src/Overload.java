
public class Overload {

	public void m1(Object obj)
	{
		System.out.println("obj");
		
	}
	
	public void m1(String str)
	{
		System.out.println("str");
		
	}
	
	public void m1(Integer in)
	{
		System.out.println("int");
		
	}
	
	public static void main(String[] args) {
		Overload o=new Overload();
		         o.m1(0);
		
	}
}
