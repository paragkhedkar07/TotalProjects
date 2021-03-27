package com.addressstudenttask;

public class Test 
{
	public static void main(String[] args) {
		
	
  Address ladr=new Address();
      ladr.setAreaname("karvenagar");
      
  Address padr=new Address();
       padr.setCityname("pune");
	
       Student s=new Student();
            s.getAddress().add(ladr);
            s.getAddress().add(padr);
	
}
}