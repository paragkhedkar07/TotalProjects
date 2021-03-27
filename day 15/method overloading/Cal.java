public class Cal
{
public int getsum(int a,int b)
{
   int c=a+b;
    return c;
}
public float getsum(int a,float b)
{
   float c=a+b;
    return c;
}
public float getsum(float a,int c)
{
   float b=a+c;
    return b;
}
public void getsum(float a,float b)
{
   float c=a+b;
  System.out.println(c);
}
public String getsum(String s,int a)
{
   String c=s+a;
    return c;
}
public static void main(String args[])
{
    Cal c=new Cal();

    int sum=c.getsum(10,10);
   System.out.println(sum);
   
    float s=c.getsum(10,40.3f);
  System.out.println(s);

    float a=c.getsum(30.6f,20);
   System.out.println(a);

     c.getsum(39.2f,67.2f);
    
   
   String d=c.getsum("ajbj",10);
   System.out.println(d);
}
}