public class A
{
 
public static void main(String args[])
{
 int count=0;
int no=123,temp=0,rev=0;
  while(no>0)
{
 temp=no%10;
rev=rev*10+temp;
no=no/10;
count++;


}
System.out.println(rev);
System.out.println(count);
}
}