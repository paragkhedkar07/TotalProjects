package student.info;
import java.util.Scanner;
public class Test
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter length of array");
   int length=sc.nextInt();
	
  Student[] s=new Student[length];
     
   
  for(int i=0;i<=length;i++)
  {
	  Student s1=new Student();
	  
	  System.out.println("enter first student rollno "+i);
	  int rollno=sc.nextInt();
	 // s1.setRollno(rollno);
         s1.setRollno(i+1);
      System.out.println("enter first student name "+i);
          String name=sc.next();
         // s1.setName(name);
          s1.setName("abc"+i);
      System.out.println("enter first student addr "+i);     
            String address=sc.next();
           // s1.setAddress(address);
            s1.setAddress("pune"+i);
        s[i]=s1;
  
   }
    for(int i=0;i<s.length;i++)
    {
    	System.out.println("Rollno"+s[i].getRollno());
    	System.out.println("name"+s[i].getName());
    	System.out.println("address"+s[i].getAddress());
    	
    	
    	
    }
  
  
  

}
	
}
