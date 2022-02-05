package Assignment1;

//importing Scanner
import java.util.Scanner;
public class RentalDemo {
   

    public static void main(String args[]){

        // creating 1st object for Rental Class
        Rental obj1 = new Rental();
        
        // calling methods using 1st object and storing the returned values
        //String obj1_contract = obj1.getContractNumber();
        //int obj1_hours = obj1.getHoursRental();
        //int obj1_minutes = obj1.getMinutesRental();
        //double obj1_price = obj1.getPrice();
        
        // calling this class display method
        //display(obj1_contract, obj1_hours, obj1_minutes, obj1_price);
        display (obj1.getContractNumber(),obj1.getHoursRental(),obj1.getMinutesRental(),obj1.getPrice());

        // getting contract and minutes from methods getting the user inputs
        String contract =setContract();
        int minutes = setMinutes();

        // creating 2nd object for Rental Class and passing the two local variables within the constructor
        Rental obj2 = new Rental(contract,minutes);
        
        // calling methods using 2nd object and storing the returned values
        //String obj2_contract = obj2.getContractNumber();
        //int obj2_hours = obj2.getHoursRental();
        //int obj2_minutes = obj2.getMinutesRental();
        //double obj2_price = obj2.getPrice();
        
        // calling this class display method
        //display(obj2_contract, obj2_hours, obj2_minutes, obj2_price);
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