
public class Test 
{
  public static void main(String[] args) 
  {
	System.out.println("main----");
	try
	{
	int a=10/0;	
		
	}
	catch(ArithmeticException e)
	{
	  System.out.println("catch-----Block");
	
	}
	System.out.println("main---end");
}
}
