public class Test
{
public static void main(String args[])
{
   U u=new U();
     u.m1();
     u.m2();
 System.out.println(u.a);
 System.out.println(u.b);

  U u1=new V();
    u1.m1();
    u1.m2();
 System.out.println(u1.a);
 System.out.println(u1.b);    

 U u2=new W();
   u2.m1();
   u2.m2();
System.out.println(u2.a);
System.out.println(u2.b);

 U u3=new X();
   u3.m1();
   u3.m2();
System.out.println(u3.a);
System.out.println(u3.b);

 U u4=new Y();
   u4.m1();
   u4.m2();
System.out.println(u4.a);
System.out.println(u4.b);

V v=new V();
  v.m1();
  v.m3();
  v.m2();

W w=new W();
  w.m1();
  w.m4();
  w.m2();
System.out.println(w.a);
System.out.println(w.d);
System.out.println(w.b);


W w1=new X();
  w1.m1();
  w1.m4();
  w1.m2();
System.out.println(w1.a);
System.out.println(w1.d);
System.out.println(w1.b);

W w2=new W();
  w2.m1();
  w2.m4();
  w2.m2();
System.out.println(w2.a);
System.out.println(w2.d);
System.out.println(w2.b);

X x=new X();
  x.m3();
  x.m4();
  x.m5();
  x.m1();
  x.m2();
System.out.println(x.a);
System.out.println(x.e);
System.out.println(x.d);
System.out.println(x.b);

X x1=new Y();
  x1.m3();
  x1.m4();
  x1.m5();
  x1.m1();
  x1.m2();
System.out.println(x.a);
System.out.println(x.e);
System.out.println(x.d);
System.out.println(x.b);

Y y=new Y();
  y.m4();
  y.m5();
  y.m6();
  y.m3();
  y.m1();
  y.m2();

System.out.println(y.e);
System.out.println(y.f);
System.out.println(y.a);
System.out.println(y.d);
System.out.println(y.b);
}
}