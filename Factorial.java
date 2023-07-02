//Find = 5!=5x4x3x2x1=120.


import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		System.out.println(" Type a number .");

		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = 1;
		for (int i = 1; i <= y; i++) {

			x = x * i;

		}
		System.out.println(  y + "! is equal to " + x + " . ");
	}
}
