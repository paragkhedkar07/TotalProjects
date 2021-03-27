public class B
{
   public static void main(String args[])
   {
      int x=10,y=20;
        int temp=0;
 
     
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
     
      temp = x;
      x = y;
      y = temp;
     
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
   }
}