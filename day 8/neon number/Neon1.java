public class Neon1
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int m=n*n;
int sum=0;
while(m>0)
{
sum=sum+m%10;
  m=m/10;
}
if(n==sum)
System.out.println("no is neon");
else
System.out.println("no is not neon");
}
}