import javax.swing.JOptionPane;

public class AreaOfCircle3 {

	public static void main(String[] args) {
		int radius;
		String str;
		
		str = JOptionPane.showInputDialog(null,"Enter the radius: ");
		radius = Integer.parseInt(str);
		Double area = Math.PI * radius * radius; 
		
		JOptionPane.showMessageDialog(null, "Area: " + area);

	}

}
