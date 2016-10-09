
public class StudentRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <Classname ref.variable=new <classname>
		
		Student stu=new Student (); 	// Object Creation in java
		
		stu.no=100;
		stu.name="Bhavin";
		stu.marks=100;
		
		System.out.println("First Studen no " + stu.no);
		System.out.println("First Student Name " + stu.name);
		System.out.println("First Student Marks " + stu.marks);
		
		Student stu1=new Student ();
		stu1.no=101;
		stu1.name="Shri";
		stu1.marks=200;
		
		System.out.println("Second Studen no " + stu1.no);
		System.out.println("Second Student Name " + stu1.name);
		System.out.println("Second Student Marks " + stu1.marks);
		
		System.out.println("All Studen no " + stu1.no + " " + stu.no);
		System.out.println("All Student Name " + stu1.name + " " + stu.name);
		System.out.println("All Student Marks " + stu1.marks + " " + stu.marks);

	}

}
