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
 Test t=new Test();
 int rollno=Integer.parseInt( args[0]);
 String name=(args[1]);
 String addr=(args[2]);
 int age=Integer.parseInt( args[3]);
     t.display(rollno,name,addr,age);
}
}