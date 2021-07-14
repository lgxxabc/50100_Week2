package Week2;

import java.util.Random;
import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		String name;
		int ageGuess;
		int age;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		age = generator.nextInt(101);	// 0~100
		
		System.out.print("Please enter your guess of age between 0~100: ");
		ageGuess = scan.nextInt();
		
		System.out.println("Your guess is: " + ageGuess);
		System.out.println("The age was: " + age);
	}

}
