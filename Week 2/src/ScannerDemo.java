import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = input.nextLine();
		System.out.println("Enter your age: ");
		age = input.nextInt();
		System.out.println("Hello " + name + " , you are " + age + " years old");		
		input.close();

	}

}
