public class Test
{
public String m1()
{
return "CJC";
}
public Object m2()
{
 return "Java";
}
public static void main(String args[])
{
  Test t=new Test();
String s=t.m1();
 System.out.println(s);
 String s2=(String)t.m2();
  System.out.println(s2);

}
}