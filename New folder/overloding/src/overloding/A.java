package overloding;

public class A 
{
	public void Add()
	{
		System.out.println("no parameter");
	}
	public void Add(int a)
	{
		System.out.println("one parameter");
	}
    public void Add(int a,float b)
    {
    	System.out.println("two parameter");
    	
    }
    
    public static void main(String args[])
    {
     A a=new A();
      // a.Add();
      // a.Add(10);
       a.Add(20,20.7f);
    }
}
