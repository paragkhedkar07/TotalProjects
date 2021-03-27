public class Sum
{
public static void main(String args[])
{
  int n=1234;
  int sum=0,rem;
  while(n>0)
 {
 rem=n%10;
 n=n/10;
 sum=sum+rem;
}
System.out.println(sum);
if(sum>=10)
{
int s=0;
rem=sum%10;
n=sum/10;
s=rem+n;

}
}
}