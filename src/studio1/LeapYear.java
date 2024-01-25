package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isLeapYear;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a year?");
		int year = kb.nextInt();
		
		isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		System.out.println(year + " is a leap year: " + isLeapYear);
	}

}
