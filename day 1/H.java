public class H
{
public void sum()
{
int a,b,c;
a=10;
b=20;
c=a+b;
System.out.println("addition="+c);
}
public void sub() 
{
int a,b,c;
a=20;
b=30;
c=a-b;
System.out.println("substraction="+c);
}
public void mul() 
{
int a,b,c;
a=50;
b=40;
c=a*b;
System.out.println("multiplication="+c);
}
public void div() 
{
int a,b,c;
a=20;
b=5;
c=a/b;
System.out.println("division="+c);
}
public static void main(String args[])
{
System.out.println("parag");
H h=new H();
  h.sum();
  h.sub();
  h.mul();
  h.div();
}

}