public class Employee
{
 private int id;
 private String name;
 private double salary;
 private Department dep;

public void setId(int id)
{
  this.id=id;
} 
public void setName(String name)
{
  this.name=name;
}
public void setSalary(double salary)
{
  this.salary=salary;
}
public void setDep(Department dep)
{
  this.dep=dep;
}
public int getId()
{
  return id;
} 
public String getName()
{
  return name;
}
public double getSalary()
{
  return salary;
}
public Department getDep()
{
  return dep;
}
}