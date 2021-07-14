package Week2;

import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 9: ");
		num = scan.nextInt();
		
		switch(num) {
			case 9:
				System.out.println("nine");
				break;	
			case 8:
				System.out.println("eight");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 6:
				System.out.println("six");
				break;
			case 5:
				System.out.println("five");
				break;
			case 4:
				System.out.println("four");
				break;
			case 3:
				System.out.println("three");
				break;
			case 2:
				System.out.println("two");
				break;
			case 1:
				System.out.println("nine");
				break;
			case 0:
				System.out.println("zero");
				break;
			default:
				System.out.println("You enter a wrong number.");
				
			scan.close();
		}
	}

}
