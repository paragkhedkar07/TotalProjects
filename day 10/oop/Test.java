public class Test
{
public void display(Student stu)
{
System.out.println("Rollno:-"+stu.getRollno());
System.out.println("Name:-"+stu.getName());
System.out.println("Addr:-"+stu.getAddr());
System.out.println("Age:-"+stu.getAge());
}
public static void main(String args[])
{
  Test t=new Test();
  Student stu=new Student();
 stu.setRollno(Integer.parseInt(args[0]));
 stu.setName(args[1]);
 stu.setAddr(args[2]);
 stu.setAge(Integer.parseInt(args[3]));
    t.display(stu);
}
}