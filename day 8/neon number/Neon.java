public class Neon
{
public static void main(String args[])
{
 int n=9,m=n*n,sum=0;
while(m>0)
{
sum=sum+m%10;
  m=m/10;

}
System.out.println(sum);
}
}