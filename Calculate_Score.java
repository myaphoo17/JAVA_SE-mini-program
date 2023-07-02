//Fail, Pass, Credit or Distinction according to the scores.
package Assignment;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Myanmar Scores : ");
		int a = sc.nextInt();
		Score(a);

		Scanner sca = new Scanner(System.in);
		System.out.println(" English Scores : ");
		int b = sc.nextInt();
		Score(b);
		Scanner scan = new Scanner(System.in);
		System.out.println(" Math Scores : ");
		int c = sc.nextInt();
		Score(c);
	}

	public static void Score(int v) {
		if (v < 40)
			System.out.println(" Fail");
		if (v >= 80)
			System.out.println(" Pass with Distinction");
		else if (40 <= v & v <= 60)
			System.out.println(" Pass");
		else if (v > 60)
			System.out.println(" Credit");
	}
}
