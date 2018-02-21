import java.util.Scanner;

public class AreaRectangle {
	public static void main (String [] args){

		//created a scanner
		Scanner scan=new Scanner(System.in);

		//a loop that will run three times
		for (int i=0; i<3; i ++){

			// asked for length &width
			System.out.println("Transfer the length and width");
			int width =scan.nextInt();
			int length=scan.nextInt();

			//created rectangle with information the user inputed
			Rectangle one=new Rectangle(length,width);

			//printed out area & perimeter
			System.out.println(one.GetArea());
			System.out.println(one.Getperimeter());


		}



	}
}
