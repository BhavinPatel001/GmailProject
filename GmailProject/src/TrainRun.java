
public class TrainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Train trn=new Train();
			trn.Destination="Los Angeles";
			trn.Number=111;
			
			Train trn1=new Train();
			trn1.Destination="Orlando";
			trn1.Number=555;
			
			System.out.println("First Train Destination --> " + trn.Destination);
			System.out.println("First Train Number " + trn.Number);
			System.out.println("Second Train Destination --> " + trn1.Destination);
			System.out.println("Second Train Number " + trn1.Number);
	}

}
