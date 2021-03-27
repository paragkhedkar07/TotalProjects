package com.callablemethod;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.logging.Filter;



public class Test 
{
private static final String Excuters = null;

public static void main(String[] args) {
	
	MyRunnable mr=new MyRunnable();
	myCallable odd=new myCallable(1,10);
	myCallable even=new myCallable(2,10);
	
	ExecutorService es=Excuters.new FixedThreadPool(2);
	                    es.submit(mr);
	
	Filter fr= (Filter) es.submit(odd);
	Filter fr1= (Filter) es.submit(even);
	
	System.out.println(((Future<?>) fr).get());
	System.out.println();
}
}
