import java.util.Scanner;
public class Strong
{
public static void main(String args[])
{
  int count=0,no,rem=0;
   int sum=0;
   int fact=1;
Scanner sc=new Scanner(System.in);
 System.out.println("enter no");
  int n=sc.nextInt();  
for(int j=1;j<=n;j++)
{
 int temp=j;
 no=j;
sum=0;
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
System.out.println("the  strong no are:"+sum);
}

}
}
}
