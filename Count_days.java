package Assignment;

import java.time.LocalDate;
import java.time.Period;

public class Count_days {

	public static void main(String[] args) {

		LocalDate DOB = LocalDate.of(2023, 04, 1);
		System.out.println("Your date of Birth		:" + DOB);

		LocalDate Today = LocalDate.now();
		System.out.println("Today date			:" + Today);

		Period period = Period.between(DOB, Today);
		System.out.println(period);

	}

}
//Output
//Your date of Birth		:2003-01-01
//Today date					:2023-03-30
//P20Y2M29D