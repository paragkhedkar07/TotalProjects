public class K
{
public void sum(int a,int b)
{
 int c=a+b;
System.out.println(c);
}
public void sub(int a,int b)
{
 int c=a-b;
System.out.println(c);
}
public void mul(int a,int b)
{
 int c=a*b;
System.out.println(c);
}
public void div(int a,int b)
{
 int c=a/b;
System.out.println(c);
}
public static void main(String args[])
{
System.out.println("hello india");
 K k=new K();
 k.sum(10,20);
 k.sum(20,30);
 k.sub(20,40);
 k.mul(20,34);
 k.div(20,10); 
}


}