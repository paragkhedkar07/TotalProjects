package bus.reservation.system;

public class TicketBookingThread extends Thread 
{
  private TicketCounter ticketCounter;
  private String PassengerName;
  private int NoOfSeatsToBook;
  
  public TicketBookingThread(TicketCounter ticketCounter,String passengerName,int NoOfSeatsToBook)
  {
	   this.ticketCounter=ticketCounter;
	   this.PassengerName=passengerName;
	   this.NoOfSeatsToBook=NoOfSeatsToBook;
	  
}	
	public void run()
	{
		ticketCounter.bookTicket(PassengerName, NoOfSeatsToBook);
		
	}
	
}
