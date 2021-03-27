public class C extends A
{
public void m3() 
{
System.out.println(x);
  m1();
}
public static void main(String args[])
{
 C c=new C();
   c.m3();

}
}