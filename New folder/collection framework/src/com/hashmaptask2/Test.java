package com.hashmaptask2;
import java.util.*;

import com.Hashmapemployeetask.Employee;
public class Test 
{
public static void main(String[] args) 
{
	Map<Teacher,Student>m=new HashMap();
	 Teacher t=new Teacher();
	         t.setTid(1);
	         t.setTname("pravin");
	 Student s=new Student();
	         s.setRollno(10);
	         s.setName("ram");
	         m.put(t,s);
	
	Teacher t1=new Teacher();
	         t1.setTid(2);
	         t1.setTname("shubham");
	 Student s1=new Student();
	         s1.setRollno(10);
	         s1.setName("amit");
	         m.put(t1,s1);
	         
	         Set<Teacher>keys=m.keySet();	
             
             Iterator<Teacher>itr=keys.iterator();
             while(itr.hasNext())
             {
             Teacher key=itr.next();
             Student val=m.get(key);
            // System.out.println(key);
             //System.out.println(val);
             System.out.println(key.getTid());
             System.out.println(key.getTname());
             System.out.println(val.getRollno());
             System.out.println(val.getName());
            
}
}}
