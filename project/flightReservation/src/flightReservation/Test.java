package flightReservation;

public class Test extends Passenger {
	
	public static void main(String[] args) {
		
		Passenger p=new Passenger();
		Address a= new Address();
		Contact c=new Contact();
		      
		          p.setId(10);
		          p.setAddress(a);
		          p.setContact(c);
		          a.setCity("wardha");
		          a.setState("maharastra");
		          a.setStreet("hfhv");;
		          c.setEmail("parag.gmail.com");
		          c.setName("parag");
		          c.setPhone("8928964573");
		  System.out.println(p.getId());
		System.out.println(p.getAddress().getCity());
		System.out.println(p.getAddress().getState());
	    System.out.println(	p.getAddress().getStreet());
	    System.out.println(p.getContact().getEmail());
	    System.out.println(p.getContact().getName());
	    System.out.println(p.getContact().getPhone());
	}

}
