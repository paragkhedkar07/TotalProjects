
public class Test 
{
   public static void main(String args[])
   {
	 try
	 {
		String s="abc";
		int x=Integer.parseInt(s);
		int a=10/x; 
	}
	 catch(ArrayIndexOutOfBoundsException e)
	 {
    System.out.println("plz enetr i/p value");		 
	}
	 catch(NumberFormatException e)
	 {
		System.out.println("plzenter no"); 
	}
	 catch(ArithmeticException e)
	 {
		 
		 System.out.println("plz enter non zero value");
	 }
   }
}
