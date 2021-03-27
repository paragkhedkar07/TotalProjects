package com.cjc.Bufferwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test
{
public static void main(String[] args) throws IOException
{
	FileWriter f=new FileWriter("cjc.txt");
	BufferedWriter b=new BufferedWriter(f);
	     b.write(65);
	     b.write(66);
	     b.newLine();
	     b.write("cjc");
	     b.newLine();
	     char []c={'j','a','v','a'};
	     b.write(c);
	     b.flush();
	     b.close();
	     
}
	
}
