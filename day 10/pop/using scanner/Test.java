import java.util.Scanner;
public class Test
{
public void display(int rollno,String name,String addr,int age)
{
System.out.println("Rollno:-"+rollno);

System.out.println("Name:-"+name);

System.out.println("Addr:-"+addr);

System.out.println("Age:-"+age);
}
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter rollno");
  int a=sc.nextInt();
 System.out.println("enter name");
  String b=sc.next();
 System.out.println("enter addr");
  String c=sc.next();
 System.out.println("enter age");
  int d=sc.nextInt();
      
    Test t=new Test();
   t.display(a,b,c,d);
}
}