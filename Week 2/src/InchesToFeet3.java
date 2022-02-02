import javax.swing.JOptionPane;

public class InchesToFeet3 {

	public static void main(String[] args) {
double inches = 0;
		
		inches = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number of inches: "));
		
		double feet = inches/12;
		double inch = inches%12;

		
		JOptionPane.showMessageDialog(null, Math.round(feet) + " Feet " + Math.round(inch) + " Inches");

	}

}
