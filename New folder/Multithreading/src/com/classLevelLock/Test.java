package com.classLevelLock;

public class Test 
{
  public static void main(String[] args)
 {
    Hello h=new Hello();
    Hello h1=new Hello();
    
    MyThread t1=new MyThread("java",h);
    MyThread t2=new MyThread("classes",h);
             t1.start();
             t2.start();
    
    MyThread t3=new MyThread("cjc",h1);
    MyThread t4=new MyThread("pune",h1);
             t3.start();
             t4.start();
  }
}
