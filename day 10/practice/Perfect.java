public class Perfect
{
public static void main(String args[])
{
    int sum=0; 
  for(int n=5;n<=1000;n++)
{
      sum=0;
  for(int i=1;i<=n/22;i++)
{
   if(n%i==0)
{   

   sum=sum+i;   
}
} 
  if(sum==n)
{
System.out.println(n);
 }
  }
}
}