package Assignment;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {

		System.out.println("Type a character");
		Scanner cc = new Scanner(System.in);
		char a = cc.next().charAt(0);

		switch (a) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The character is a vowel");
			break;

		default:
			System.out.println(" The character is a consonant.");
		}

	}

}
