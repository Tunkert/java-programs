public class SaddleHeight {

	// declare variables
	double inseamLength;
	double saddleHeight;

	public SaddleHeight(double i) {
		inseamLength = i;
	}

	public double calculateHeight() {
		return inseamLength * 0.885;
	}

	// main method
	public static void main(String[] args) {
		SaddleHeight saddle = new SaddleHeight(84);
		double saddleHeight = saddle.calculateHeight();

		// print saddle height
		System.out.println("Your saddle height is " + saddleHeight + ".");
	}
}
