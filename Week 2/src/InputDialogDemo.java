import javax.swing.JOptionPane;

public class InputDialogDemo {

	public static void main(String[] args) {
		String name;
		String str;
		int age;
		name = JOptionPane.showInputDialog(null,"Enter your name");
		str = JOptionPane.showInputDialog(null,"Enter your age");
		age = Integer.parseInt(str);
		
		JOptionPane.showMessageDialog(null, "Hello " + name + ", you are " + age + " years old");

	}

}
