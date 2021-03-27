public class Test
{
public static void main(String args[])
{
 Course c=new Course();
        c.setCid(123);
        c.setCname("java");

 Faculty f=new Faculty();
         f.setFid(2);
         f.setFname("Xyz");
         f.setCrs(c);

 Batch b=new Batch();
       b.setBid(34);
       b.setBname("nbcd");
       b.setFac(f);

 Student s=new Student();
         s.setSid(234);
         s.setSname("parag");
         s.setBth(b);

System.out.println(s.getSid());
System.out.println(s.getSname());
System.out.println(s.getBth().getBid());
System.out.println(s.getBth().getBname());
System.out.println(s.getBth().getFac().getFid());
System.out.println(s.getBth().getFac().getFname());
System.out.println(s.getBth().getFac().getCrs().getCid());
System.out.println(s.getBth().getFac().getCrs().getCname());
}
}