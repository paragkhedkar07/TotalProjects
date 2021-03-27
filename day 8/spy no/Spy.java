public class Spy
{
public static void main(String args[])
{
 int n=2141,s=0,rem=0,p=1;
while(n>0)
{
  rem=n%10;
 s=s+rem;
 p=p*rem;
  
  n=n/10;
}
 if(s==p)
{
System.out.println("the no is spy no");
}
else
{
System.out.println("not spy");

}

}


}