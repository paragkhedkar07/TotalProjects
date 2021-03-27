public class Test
{
public A m1() 
{
B b=new B();
  b.x=300;
  return b;
}
public static void main(String args[])
{
Test t=new Test();
A a=t.m1();
    //B b=(B) a;
//System.out.println(b.x);

   B b1=(B)t.m1();
System.out.println(b1.x);

}

}