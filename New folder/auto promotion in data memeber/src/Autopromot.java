
public class Autopromot 
{
 public void m1(int a, float b)
 {
	System.out.println(b); 
	 
}
 public void m1(float d,int a)
 {
	 System.out.println(d);
	 
 }
 public static void main(String a[])
 {
	 Autopromot t=new Autopromot();
	     // t.m1(0x110);//hexhadecimal x;//if we write 0 at first like 0110  this is octal value 
	// t.m1(10,10);       both are like int and float values in both methods so it gives ambiguity error
	 t.m1(10,3.3f);   
 }
}
