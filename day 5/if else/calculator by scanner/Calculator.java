import java.util.Scanner;
public class Calculator
{
public static void main(String []args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter number");
       int a=sc.nextInt();
 System.out.println("enter another number");
       int b=sc.nextInt();
       
       int c=a+b;
       int d=a-b;
       int e=a*b;
       int f=a/b;
 System.out.println("the addition is"+c);    
 System.out.println("the substraction is"+d);
 System.out.println("the multiplication is"+e);
 System.out.println("the division is"+f);


}


}