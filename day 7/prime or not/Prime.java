public class Prime
{
public static void main(String args[])
{
int n=4,count=0;
for(int i=1;i<=n;i++)
{
  if(n%i==0)
{
  count++;
}

}
  if(count==2)
{
System.out.println("no is prime");
}
else
{
System.out.println("no is not prime");
}
}
}