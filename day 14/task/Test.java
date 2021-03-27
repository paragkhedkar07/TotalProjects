public class Test
{
 
public Employee setDetails()
{
Employee e=new Employee();
         e.setEid(1);
      e.setEname("parag");
       return e;
}
public void getDetails(Employee e)
{
  
System.out.println(e.getEid());
System.out.println(e.getEname());
}
public static void main(String args[])
{
    Test t=new Test();
     Employee e=t.setDetails();
        t.getDetails(e);
}
}