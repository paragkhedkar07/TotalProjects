package com.highest;

public class Test 
{
	public static void main(String[] args) {
	

  int first=0,second=0;
  int a []={10,1,20,18,30};
  for(int i=0;i<a.length;i++)
  {
	  if(a[i]>first)
	  {
		  second=first;
		  first=a[i];
	  }
	  else if(a[i]>second&&a[i]!=first)
	  {
		  
		  second=a[i];
	  }
	  
  }
  System.out.println("first"+first);
  System.out.println("second"+second);
}
}
