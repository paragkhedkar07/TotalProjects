package com.smallest;

public class Test 
{
	public static void main(String[] args) {
	

  int first=0,second=0;
  int a []={10,1,20,18,30};
  for(int i=0;i<a.length;i++)
  {
	  if(a[i]>first)
	  {
		  first=second;
		  first=a[i];
	  }
	  else if(a[i]>first&&a[i]!=second)
	  {
		  
		  second=a[i];
	  }
	  
  }
  System.out.println("first"+first);
  System.out.println("second"+second);
}
}
