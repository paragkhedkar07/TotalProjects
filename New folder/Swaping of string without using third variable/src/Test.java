
public class Test 
{
  public static void main(String[] args) {
	
	  String s1="hello";
	  String s2="cjc";
	  s1=s1+s2;
	 s2=s1.substring(0,s1.length()-s2.length());
	 s1=s1.substring(s2.length());
	  System.out.println("after swaping "+s1);
	  System.out.println("after swaping "+s2);
  }}