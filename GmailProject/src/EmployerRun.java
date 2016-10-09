
public class EmployerRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employer emp=new Employer ();
		
		emp.name="Test Company name001";
		emp.Address="Schaumburg";
		emp.TotalEmployees=10000;
		
		Employer emp1=new Employer ();
		
		emp1.name="Test Company name002";
		emp1.Address="Palatine";
		emp1.TotalEmployees=20000;
		
		System.out.println("Company Name - " + emp.name);
		System.out.println("Company Address - " + emp.Address);
		System.out.println("Total no of employee - " + emp.TotalEmployees);
		
		System.out.println("Company Name - " + emp1.name);
		System.out.println("Company Address - " + emp1.Address);
		System.out.println("Total no of employee - " + emp1.TotalEmployees);
	}

}
