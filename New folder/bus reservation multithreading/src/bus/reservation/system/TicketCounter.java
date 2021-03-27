package bus.reservation.system;

public class TicketCounter
{
  private  int  availableSeats=3;
  
  synchronized public  void bookTicket(String pname,int numberOfSeats)
  {
	  if((availableSeats>=numberOfSeats) && (numberOfSeats>0))
	  {
		System.out.println("Hi,"+pname+" : "+ numberOfSeats+ " Seats booked Successfully..");
		       availableSeats=availableSeats- numberOfSeats;
	}
	  
	  else
	  {
		  System.out.println("Hi,"+pname + " : Seats Not Available");
		  
	 }
	  
 }
	
	
	
	
}
