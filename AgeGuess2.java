package Week2;

import java.util.Random;
import java.util.Scanner;

public class AgeGuess2 {

	public static void main(String[] args) {
		String name;
		int ageGuess;
		int age;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		age = generator.nextInt(101);
		
		System.out.print("Please enter your guess of age between 0~100: ");
		ageGuess = scan.nextInt();
		
		if (age != ageGuess) {
			System.out.println("You guessed wrong!");
			if (ageGuess > age) {
				System.out.println("Older");
			} else {
				System.out.println("Younger");
			}
		}
		
		System.out.println("Your guess is: " + ageGuess);
		System.out.println("The age was: " + age);
	}

}
