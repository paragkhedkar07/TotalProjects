public class B
{
   B()

{
System.out.println("const");
}
B(int b)
{
System.out.println("constructor call");
}
public static void main(String args[])
{
B b=new B();
B b1=new B(10);
}
}