package Assignment1;

//importing Scanner
import java.util.Scanner;
public class RentalDemo {
   

    public static void main(String args[]){

        // creating 1st object for Rental Class
        Rental obj1 = new Rental();
        
        // calling the display method using first object
        display (obj1.getContractNumber(),obj1.getHoursRental(),obj1.getMinutesRental(),obj1.getPrice());

        // initializing data fields by getting contract and minutes from methods getting the user inputs
        String contract =setContract();
        int minutes = setMinutes();

        // creating 2nd object for Rental Class and passing the two local variables within the constructor
        Rental obj2 = new Rental(contract,minutes);
        
        // calling the display method using second object
        display (obj2.getContractNumber(),obj2.getHoursRental(),obj2.getMinutesRental(),obj2.getPrice());

    }
    
    static // creating scanner object
    Scanner sc = new Scanner(System.in);

    // method to get contract number from user
    public static String setContract(){
        System.out.println("Enter contract number: ");
        return  sc.nextLine();
    }

    // method to get number of minutes from user
    public static int setMinutes(){
        System.out.println("Enter the minutes: ");
        return sc.nextInt();
    }
    
    // method to display output
    public static void display(String contract, int hours, int minutes, double price){
        System.out.println("Contract Number: " + contract);
        System.out.println("Number of hours: " + hours);
        System.out.println("Number of minutes: " + minutes);
        System.out.println("Total price: " + price);
    }
}

//Arun David (300347125)