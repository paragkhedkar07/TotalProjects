package com.calculator;
import  com.addition.Addition;
import  com.substraction.Substraction;
import  com.multiplication.Multiplication;
import  com.division.Division;
public class Calculator
{
 public static void main(String args[])
{
  Addition a=new Addition();
           a.add(10,20);
  Substraction s=new Substraction();
           s.sub(30,20);
  Multiplication m=new Multiplication();
           m.mul(47,23);
  Division d=new Division();
           d.div(23,3);


}



}
