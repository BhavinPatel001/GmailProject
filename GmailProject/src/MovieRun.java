
public class MovieRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie mve=new Movie ();
		
		mve.MovieName="Rambo";
		mve.ReleaseYear=1989;
		
		Movie mve1=new Movie ();
		mve1.MovieName="Rocky";
		mve1.ReleaseYear=1985;
		
		System.out.println("First Movie Name - " + mve.MovieName);
		System.out.println("First Movie Release Year " + mve.ReleaseYear);
		System.out.println("Second Movie Name - " + mve1.MovieName);
		System.out.println("Second Movie Release Year " + mve1.ReleaseYear);
	}

}
