import java.util.Scanner;

public class SimpleInterest2 {

	public static void main(String[] args) {
		//Take input from the user
        //Create an instance of Scanner class
        Scanner sc = new Scanner(System.in);
        //Declare variables
        float p, r, t, si;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     //Initialize the variables
        sc.close();
        //Calculate the simple interest
        si = (p * r * t) / 100;
        //Print the simple interest
        System.out.println("Simple Interest is: " +si);

	}

}
