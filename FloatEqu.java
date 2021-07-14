package Week2;

public class FloatEqu {

	public static void main(String[] args) {
		double a = (1.0 / 10) * (1.0 / 10);
		double b = (1.0 / 100);
		double tolerance = 0.000001;
		
		if (a == b) {
			System.out.print("EQUAL");
		} else {
			System.out.print("NOT EQUAL");
		}
		
//		Output1:
//		NOT EQUAL
		
		System.out.println();
		
		if (Math.abs(a - b) < tolerance) {
			System.out.print("EQUAL");
		} else {
			System.out.print("NOT EQUAL");
		}
		
//		Output2:
//		EQUAL
	}

}
