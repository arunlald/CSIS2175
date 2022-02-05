package Assignment1;

public class Event {
	// two public final static
	public final static int PRICE_PER_GUEST = 35;
	public final static int CUTT_OFF_VALUE = 50;
	
	// three private fields
	private String eventNumber;
	private int numberOfGuest;
	private int price;
	
	// two public set static set of method
	public void setEventNumber(String eventNum){
		this.eventNumber=eventNum;
	}
	public void setNumberOfGuest(int guestNum){
		this.numberOfGuest=guestNum;
		if (numberOfGuest<=50) {
		price = numberOfGuest*PRICE_PER_GUEST;
		}
	}
	
	// three public get method
	public String getEventNumber(){
		return eventNumber;
	}
	public int getNumberOfGuest(){
		return numberOfGuest;
	}
	public int getPrice(){
		return price;
	}
	
	 
    Event(String eventnumber, int numberofguests, int price){
        this.eventNumber = eventnumber;
        this.numberOfGuest = numberofguests;
        this.price = price;
    }

	 // default constructor
    Event(){
        this("A000", 0, 0);
    }
}