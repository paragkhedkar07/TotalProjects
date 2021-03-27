import java.util.Scanner;
public class Prime1
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   System.out.println("enter no");
   int n=sc. nextInt(); 
Scanner s=new Scanner(System.in);
   System.out.println("enter no");
   int no=s. nextInt(); 


 for(int i=n;i<=no;i++)
  { 
   int count=0;
  for(int j=2;j<=i/2;j++)
  {
    if(i%j==0)
    {
      count++;
       break;
      }
}
   if(count==0)
{
System.out.println(i);
}
}
}
}