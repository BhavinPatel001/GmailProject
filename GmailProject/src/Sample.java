
public class Sample {

	int a=10;			// instance variable
	String name1="Bhavin";	// instance variable
	
	static String name2="Patel"; 	//static variable
	
	public void login(){
		int b=12; 		// local variable
		System.out.println("Local to Function :" + b);
		System.out.println("Instance variable : " + name1);
		System.out.println("Static Variable : " + name2);
		
	}
	
	public void logout(){
		int d=35;
		int f = d + 100;
		System.out.println("Output from logout : " + d);
		System.out.println("Output from logout : " + f);
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample temp=new Sample();
		temp.login();
		temp.logout();
	}

}
