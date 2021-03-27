package com.enhanceforloop;
import java.util.*;
public class City 
{
public static void main(String[] args) {
	
	   List<String>mh=new ArrayList<>();
	               mh.add("pune");
	               mh.add("wardha");
	               mh.add("nagpur");
	               
       List<String>jh=new ArrayList<>();
                   jh.add("ranchi");
                   jh.add("lohardaga");
       List<List<String>>india=new ArrayList<>();
                  
                   india.add(mh);
                   india.add(jh);
                   for(List<String>list:india)
                   {
                	   for(String city:list)
                	 System.out.println(city);  
                	   
                   }
	
}
}
