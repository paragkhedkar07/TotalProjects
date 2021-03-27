public class Narrow
{
public void m1(Object a)
{
System.out.println("m1-----object");
}
public void m1(String s)
{
System.out.println("m1-----string");
}
public static void main(String args[])
{
Narrow n=new Narrow();
       n.m1(null);

}

}