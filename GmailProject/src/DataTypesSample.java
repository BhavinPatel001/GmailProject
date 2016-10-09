
public class DataTypesSample {
	
	byte s=10;
	byte s1=100;										// instance variable
	short m=10000;
	int n=01234567;
	long j=12345678l;
	
	static int sat=111;									//Static variable
	
	float a=10999.322f;									// Better to use float if we have 2 digit after decimal
	double a1=10.3444444444; 							// Double can take more 2 digit after decimal
	
	char c='Z';
	boolean k=true;
	
	public static void main(String[] args) {
	
		DataTypesSample DTS=new DataTypesSample ();          // variable DTS is non-premitive data type
		
		int temp=10; 									// local variable
		long z=DTS.j;
		System.out.println(z);
				
		System.out.println("Byte : " + DTS.s);
		System.out.println("Byte : " + DTS.s1);
		System.out.println("Short : " + DTS.m);
		System.out.println("Int : " + DTS.n);
		System.out.println("long : " + DTS.j);
		System.out.println("Float : " + DTS.a);
		System.out.println("Double: " + DTS.a1);
		System.out.println("Char : " + DTS.c);
		System.out.println("Boolean : " + DTS.k);
	}

}
