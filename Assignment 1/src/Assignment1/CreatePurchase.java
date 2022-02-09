package Assignment1;

import java.util.Scanner;

public class CreatePurchase
{
    public static void main(String args[])
    {
        // creating Purchase class object
    	Purchase purchase=new Purchase();
    	
    	// creating scanner object
        Scanner s=new Scanner(System.in);
        System.out.println("***Purchase Details***");
        
            System.out.print("Enter invoice number[between 1000 and 8000]: ");
            //int i=s.nextInt();
            purchase.setInvoiceNumber(s.nextInt());
            
        
            System.out.print("Enter amount of purchase[should be non-negative]: ");
            //int a=s.nextInt();
            purchase.setAmountOfSales(s.nextInt());
  
        purchase.display();
    }
}

//Arun David (300347125)