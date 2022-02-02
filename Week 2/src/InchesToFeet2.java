import java.util.Scanner;

public class InchesToFeet2 {

	public static void main(String[] args) {
		Double inches;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter inches:");
		inches = in.nextDouble();

		double feet = inches/12;
		double inch = inches % 12;

		System.out.println(Math.round(feet) + " Feet " + Math.round(inch) + " Inches");

	}

}
