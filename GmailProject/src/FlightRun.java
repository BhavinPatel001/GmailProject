
public class FlightRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight flt=new Flight();
		flt.FlightNumber=0101;
		flt.Destination="Chicago";
		
		Flight flt1=new Flight();
		flt1.FlightNumber=0200;
		flt1.Destination="New York";
		
		System.out.println("First Flight Number " + flt.FlightNumber);
		System.out.println("First Flight Destination --> " + flt.Destination);
		System.out.println("Second Flight Number " + flt1.FlightNumber);
		System.out.println("Second Flight Destination --> " + flt1.Destination);
	}

}
