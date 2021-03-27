public class Perfect
{
public static void main(String args[])
{
  int n=7;
   int sum=0;
   int i=1;
while(i<=n/2)
{
  if(n%i==0)
{
  sum=sum+i;
    
}
i++;
}   
 if(n==sum)
{
System.out.println("no is perfect no");
  
}
else
{
System.out.println("no is not perfect");
   

}
}
}