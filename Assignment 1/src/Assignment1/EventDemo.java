package Assignment1;

import java.util.Scanner;
public class EventDemo {
public static void main (String [] args){
	
	Event def = new Event();
	
	display (def.getEventNumber(),def.getNumberOfGuest(), def.getPrice(),def.PRICE_PER_GUEST, def.CUTT_OFF_VALUE);
	
	Event eve = new Event();
	eve.setEventNumber(geteventnumber());
	eve.setNumberOfGuest(getnumberofguests());

	display (eve.getEventNumber(),eve.getNumberOfGuest(), eve.getPrice(), eve.PRICE_PER_GUEST, eve.CUTT_OFF_VALUE);
}

public static String geteventnumber(){
	Scanner inp = new Scanner(System.in);
	System.out.println("Enter the event number: ");
	String a = inp.nextLine();
	return a;
}


public static int getnumberofguests(){
	Scanner inp= new Scanner(System.in);
	System.out.println("Enter the number of guests: ");
	int a = inp.nextInt();
	return a;
	}



public static void display(String event_number, int number_of_guests, int price,  int price_per_guest,int max_guests){
	System.out.println("Event number: "+event_number);
	System.out.println("Number of guest: "+number_of_guests);
	System.out.println("Price per guest: "+price_per_guest);
	System.out.println("Total price: "+price);
	}

}

//Arun David (300347125)
