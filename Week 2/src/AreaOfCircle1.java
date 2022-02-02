import java.util.Scanner;

public class AreaOfCircle1 {

	public static void main(String[] args) {
		System.out.print("Enter radius of circle: ");
        Scanner sn = new Scanner(System.in);
        final int radius = 4;
         
        Double area = Math.PI * radius * radius;        
        System.out.println("Area = "+area);

	}

}
