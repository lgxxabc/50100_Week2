package Week2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistCalc {

	public static void main(String[] args) {
		double x1, y1, x2, y2;
		double X, Y, Dist;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print ("Enter x and y of the first coordinate: ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		
		System.out.print ("Enter x and y of the second coordinate: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		X = Math.pow((x2 - x1), 2);
		Y = Math.pow((y2 - y1), 2);
		
		Dist = Math.sqrt(X + Y);
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println("The distance between them is: " + fmt.format(Dist));
		
//		Outputs:
//			Enter x and y of the first coordinate: 2 0
//			Enter x and y of the second coordinate: 0 2
//			The distance between them is: 2.828
	}

}
