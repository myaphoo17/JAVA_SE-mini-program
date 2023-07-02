package Assignment;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pound = requestPound(sc);
		int feet = requestFeet(sc);
		int inches = requestInches(sc);
		float kg = convertKg(pound);
		float meter = convertMeter(feet, inches);
		float bmi = computeBMI(kg, meter);
		resultBMI(bmi);
	}

	public static int requestPound(Scanner sc) {
		System.out.println(" Enter Pound");
		int pound = sc.nextInt();
		return pound;
	}

	public static int requestFeet(Scanner sc) {
		System.out.println(" Enter Feet");
		int feet = sc.nextInt();
		return feet;
	}

	public static int requestInches(Scanner sc) {
		System.out.println(" Enter Inches");
		int inches = sc.nextInt();
		return inches;
	}

	public static float convertKg(int pound) {
//1kg= 0.454pounds

		float kg = pound * 0.454f;

		System.out.println("Weight = " + kg + " Kg");
		return kg;
	}

	public static float convertMeter(int feet, int inches) {

		float inch = feet * 12;
		float m = inch + inches;

		float meter = (m * 0.0254f);
		System.out.println("Height = " + meter + " meters");

		return meter;
	}

	public static float computeBMI(float kg, float meter) {

		float m = meter * meter;
		float bmi = kg / m;
		System.out.println(m);
		System.out.println("your BMI is " + bmi);
		return bmi;
	}

	public static void resultBMI(float bmi) {

		if (bmi < 18) {
			System.out.println("  Underweight");
		}
		else if (bmi > 24.9) {
			System.out.println(" Overweight");
		}
		else if (18 < bmi & bmi < 24.9) {
			System.out.println(" Healthy ");
		}
	}
}
