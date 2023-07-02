package Assignment;
import java.util.Scanner;

public class LinearSearch {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
sc = new Scanner (System.in);
		
		System.out.println("3,5,2,7,9,10,15,7,0,4");
		System.out.println("Type a number you want to Search ");
			
		int a = sc.nextInt();
		int [ ]arr = {3,5,2,7,9,10,15,7,0,4};
	
		for (int i= 0; i<arr.length;i++) {
			if 	(a==arr[i]) {
				System.out.println(" Found at "+ i);
		}
		 if (a!= arr[i]) {
				System.out.println(" not found -1");
		
		}
		
	}}}




