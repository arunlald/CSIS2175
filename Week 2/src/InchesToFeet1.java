import java.util.Scanner;

public class InchesToFeet1 {

	public static void main(String[] args) {
		Double inches = 86.0;

		Scanner in = new Scanner(System.in);

		double feet = inches/12;
		double inch = inches % 12;

		System.out.println(Math.round(feet) + " Feet " + Math.round(inch) + " Inches");

	}

}
