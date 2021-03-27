
public class Calculator implements I
{
public void add(int a,int b)
{
  int c=a+b;
  System.out.println("Addition is="+c);
}
  public int sub()
{
	int a=11, b=23;
	int c=a-b;
	
	System.out.println("Substraction is="+c);
	return c;
}
  public void mul()
  {
	int a=12,b=23;
	int c=a*b;
	System.out.println("Multiplication is="+c);  
}
  public double div(double a,double b)
  {
  	
  	double c=a/b;
  	
  	System.out.println("division is="+c);
  	return c;
  }
  
}
