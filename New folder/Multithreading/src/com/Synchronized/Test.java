package com.Synchronized;

public class Test 
{
  public static void main(String[] args)
 {
        Hello h=new Hello();
    
    MyThread t1=new MyThread("java",h);
    MyThread t2=new MyThread("classes",h);
    
             t1.start();
             t2.start();
  }
}
