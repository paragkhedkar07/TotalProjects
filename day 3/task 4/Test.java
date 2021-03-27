public class Test
{
public int sum(int a,int b)
{
   int c=a+b;
   return c;
}
public static void main(String args[])
{
   Test t=new Test();
   int s=t.sum(50,40);
System.out.println("sum of 50 and 40 is "+s);
}

}