package Week2;

import java.util.Random;
import java.util.Scanner;

public class UserNames {

	public static void main(String[] args) {
		String firstName, lastName, part1, part2, userName;
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your First Name: ");
		firstName = scan.nextLine();
		
		System.out.print("Please enter your Last Name: ");
		lastName = scan.nextLine();
		
		part1 = lastName.substring(0, 4);
		part2 = firstName.substring(0, 1);
		
		Random gen = new Random();
		num = gen.nextInt(90) + 10;
		
		userName = part1 + part2 + num;
		System.out.println (userName);
		
//		Outputs:
//		Please enter your First Name: Harry
//		Please enter your Last Name: Potter
//		PottH80
	}

}
