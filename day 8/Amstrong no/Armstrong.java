public class Armstrong
{
public static void main(String args[]) 
{
 int n=2345,count=0,no=n,sum=0;  

while(n>0)     //no of digit
{
n=n/10;
count++;
}
n=no;
while(n>0)
{
int d=n%10;    // to get no of digit
int p=1;
for(int i=1;i<=count;i++)    // to get power of digit
{
 p=p*d;
}
 sum=sum+p;
 n=n/10;
}
if(no==sum)
{
System.out.println("armstrong");
}
else
{
System.out.println("not armstrong");
}

}

}