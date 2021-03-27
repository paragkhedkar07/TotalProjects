public class Test
{
public static void main(String args[])
{
 A a= new A();
   a.m1();
   a.m2();
System.out.println(a.x);
System.out.println(a.y);

 A a1=new B();
   a1.m1();
   a1.m2();
System.out.println(a1.x);
System.out.println(a1.y);

 A a2=new C();
   a2.m1();
   a2.m2();
System.out.println(a2.x);
System.out.println(a2.y);

 B b=new B();
   b.m1();
   b.m2();
   b.m3();
System.out.println(b.z);
System.out.println(b.y);
System.out.println(b.x);

 B b1=new B();
   b1.m1();
   b1.m2();
   b1.m3();
System.out.println(b1.z);
System.out.println(b1.y);
System.out.println(b1.x);

 C c=new C();
   c.m3();
   c.m5();
   c.m1();
   c.m2();
System.out.println(c.z);
System.out.println(c.y);
System.out.println(c.w);
System.out.println(c.x);
}

}