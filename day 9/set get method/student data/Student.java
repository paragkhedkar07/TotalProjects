public class Student
{

 private int rollno;
 private String name;
 private Address adr;
 private Info inf;
 private Mobile mb;
public void setName(String name)
{
 this.name=name;
}
public String getName()
{
return name;
}
public void setRollno(int rollno)
{
this.rollno=rollno;
}
public int getRollno()
{
return rollno;
}
public void setAdr(Address adr)
{
  this.adr=adr;
}
public Address getAdr()
{
 return adr;
}
public void setInf(Info inf)
{
  this.inf=inf;
}
public Info getInf()
{
 return inf ;
}
public void setMb(Mobile mb)
{
  this.mb=mb;
}
public Mobile getMb()
{
 return mb;
}



}