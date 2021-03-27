public class Test
{
public static void main(String args[])
{
Address address=new Address();
address.setArea("Karvenagar");
address.setCityname("pune");

Student amit=new Student();
        amit.setRollno(1);
        amit.setName("Amit k.");
        amit.setAdr(address);

System.out.println(amit.getRollno());
System.out.println(amit.getName());
System.out.println(amit.getAdr().getCityname());
System.out.println(amit.getAdr().getArea());

}

}