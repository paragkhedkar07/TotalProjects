
public class Test 
{
public static void main(String[] args) 
{
	System.out.println("main----start");
	try
	{
		System.out.println("try----start");
	int a=10/0;	
	System.out.println("try----end");
	}
	catch(NullPointerException e)
	{
	  System.out.println("catch-----Block");
	
	}
	System.out.println("main---end");
}

}
