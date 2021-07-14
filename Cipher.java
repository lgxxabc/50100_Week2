package Week2;

import java.util.Random;
import java.util.Scanner;

public class Cipher {
	/*-------------------------------------*
	 * 	 Author: Guanxiaoxiong Liu		   *
	 *   Class: Programming Foundations    *
	 *   Semester: Summer 2				   *
	 *	 Assignment Name: Program 1		   *
	 *-------------------------------------*/
	
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		int total, numRandom, numEncoded;
		int lastDigit, firstDigit;
		
		Scanner scan = new Scanner(System.in);
		Random gen = new Random();
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Guanxiaoxiong Liu");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println();
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");
		
		num1 = scan.nextInt();
		if (num1 < 0 || num1 > 19) {
			System.out.println("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}
		System.out.println("1st number: " + num1);
		
		num2 = scan.nextInt();
		if (num2 < 0 || num2 > 19) {
			System.out.println("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}
		System.out.println("2nd number: " + num2);
		
		num3 = scan.nextInt();
		if (num3 < 0 || num3 > 19) {
			System.out.println("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}
		System.out.println("3rd number: " + num3);
		
		num4 = scan.nextInt();
		if (num4 < 0 || num4 > 19) {
			System.out.println("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}
		System.out.println("4th number: " + num4);
		
		num5 = scan.nextInt();
		if (num5 < 0 || num5 > 19) {
			System.out.println("Please read directions and try again!");
			scan.close();
			System.exit(0);
		}
		System.out.println("5th number: " + num5);
		System.out.println();
		
		total = num1 + num2 + num3 + num4 + num5;
		System.out.println("Total = " + total);
		
		numRandom = gen.nextInt(10);	// 0 ~ 9
		System.out.println("Your random key is " + numRandom);
		
		lastDigit = total % 10;
		lastDigit = (lastDigit + numRandom) % 10;
		total = total / 10;
		firstDigit = total % 10;
		firstDigit = (firstDigit + numRandom) % 10;
		
		numEncoded = firstDigit * 10 + lastDigit;
		System.out.println("Your encoded number is " + numEncoded);
		
		scan.close();
	}
}
