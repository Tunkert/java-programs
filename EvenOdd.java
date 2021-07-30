import java.util.Scanner; // imports scanner class
import java.lang.*; // allows to use parseInt

public class EvenOdd {
	// declare variables
	int evenOdd;

	public EvenOdd(int num) {
		evenOdd = num;
	}

	public String calculateEvenOdd() {
		if (evenOdd % 2 == 0) {
			return "even";	
		} else {
			return "odd";
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to see if it is even or odd. ");
		Scanner numScan = new Scanner(System.in);

		int num = numScan.nextInt();

		EvenOdd numCalculator = new EvenOdd(num);

		String isEvenOdd = numCalculator.calculateEvenOdd();

		System.out.println("The number is " + isEvenOdd + ".");
	}
}
