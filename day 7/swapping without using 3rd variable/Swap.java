public class Swap
{
public static void main(String args[])
{
  int x=10,y=20;
  System.out.println("before Swapping\nx = "+x+"\ny = "+y);
  x=x+y;
  y=x-y;
  x=x-y;
 System.out.println("After Swapping\nx = "+x+"\ny = "+y);

}
}