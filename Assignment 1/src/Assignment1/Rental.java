package Assignment1;

public class Rental {
    // Two public final static fields
    public final static int num_min = 60;
    public final static int hourly_rent_rate = 40;

    // Four private fields
    private String contract_number;
    private int num_of_hours_for_rental;
    private int num_of_minutes_over_an_hour;
    private double price;

    // default constructor
    Rental(){
        this("A000", 0);
    }

    // parameterized constructor
    Rental(String contract, int minutes){
        this.contract_number=contract;
        setHoursAndMinutes(minutes);
    }

    // setter method for Contract Number
    public void setContractNumber(String contract){
        contract_number = contract;
    }

    // setter method for Hours and Minutes
    public void setHoursAndMinutes(int minutes){
        num_of_hours_for_rental = minutes/num_min;
        num_of_minutes_over_an_hour = minutes%num_min; //- (num_of_hours_for_rental * 60);
        price = (num_of_hours_for_rental * hourly_rent_rate) + num_of_minutes_over_an_hour;
    }

    // getter method to get Contract Number
    public String getContractNumber(){
        return contract_number;
    }

    // getter method to get Number of Hours for Rental
    public int getHoursRental(){
        return num_of_hours_for_rental;
    }

    // getter method to get Number of Minutes for Rental
    public int getMinutesRental(){
        return num_of_minutes_over_an_hour;
    }
    
    // getter method to get the price
    public double getPrice() {
        return price;
    }
}