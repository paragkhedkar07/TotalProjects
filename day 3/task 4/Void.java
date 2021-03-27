public class Void
{
public int sum(int a,int b)
{   
   int c=a+b;
   return c;
}
public static void main(String a[])
{
    Void v=new Void();
  int x=Integer.parseInt(a[0]);
  int y=Integer.parseInt(a[1]);
  int s=v.sum(x,y);
System.out.println("sum of x and y is "+s);
}
}