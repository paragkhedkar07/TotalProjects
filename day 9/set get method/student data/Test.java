public class Test
{
public static void main(String args[])
{
Address address=new Address();
address.setArea("Karvenagar");
address.setCityname("pune");

Info info=new Info();
     info.setEmail("parag07@gmail.com");
     info.setEducation("BE");
     info.setStream("cse");
     info.setDivision("A");
     info.setCollage("sipna");

Mobile mobile=new Mobile();
       mobile.setMobile(8928964574l);

Student amit=new Student();
        amit.setRollno(1);
        amit.setName("Amit k.");
        amit.setAdr(address);
        amit.setInf(info);
        amit.setMb(mobile);




System.out.println(amit.getRollno());
System.out.println(amit.getName());
System.out.println(amit.getAdr().getCityname());
System.out.println(amit.getAdr().getArea());
System.out.println(amit.getInf().getEmail());
System.out.println(amit.getInf().getEducation());
System.out.println(amit.getInf().getStream());
System.out.println(amit.getInf().getDivision());
System.out.println(amit.getInf().getCollage());
System.out.println(amit.getMb().getMobile());
}

}