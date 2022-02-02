import javax.swing.JOptionPane;

public class SimpleInterest3 {

	public static void main(String[] args) {
		int principal =0;
		 double rate =0;
		 int time =0;
			
			
			principal = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the principal: "));
			rate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the rate: "));
			time = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the time: "));
		
			
			double si = (principal*rate*time) / 100;
			
			JOptionPane.showMessageDialog(null, "Interest: " + si);

	}

}
