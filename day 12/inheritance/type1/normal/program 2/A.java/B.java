public class B
{
A a=new A();
public void m2()
{
a.m1();
System.out.println(a.x);
}
public void m3()
{
a.m1();
System.out.println(a.x);
}
 public static void main(String args[])
{
 B b=new B();
   b.m2();
   b.m3();

}
}