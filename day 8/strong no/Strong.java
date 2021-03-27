public class Strong
{
public static void main(String args[])
{
 int no=145,fact=1,sum=0,temp=no,rem=0; 

  while(no>0)
{
   rem=no%10;
   fact=1;
for(int i=1;i<=rem;i++)
{
  fact=fact*i;
}
  sum=sum+fact;
  no=no/10;
}
 if(temp==sum)
{
System.out.println("the no is strong no");
}
else
{
System.out.println("not strong");

}
}
}
