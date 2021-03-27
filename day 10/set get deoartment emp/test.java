public class Test
{
public static void main(String args[])
{
Department d=new Department();
           d.setDid(435);
           d.setDname("cse");
Employee e=new Employee();
         e.setId(45);
         e.setName("avinash");
         e.setSalary(564726d);
         e.setDep(d);
System.out.println(e.getId());
System.out.println(e.getName());
System.out.println(e.getSalary());
System.out.println(e.getDep().getDid());
System.out.println(e.getDep().getDname());    
}
}