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
        
        while(true)
        {
            System.out.print("Enter invoice number[between 1000 and 8000]: ");
            int i=s.nextInt();
            
            // user input validation for invoice number
            if(i>=1000 && i<=8000)
            	{purchase.setInvoiceNumber(i);break;}
            else 
            	System.out.println("Wrong entry,enter again");
        }
        
        while(true)
        {
            System.out.print("Enter amount of purchase[should be non-negative]: ");
            int i=s.nextInt();
            
            // user input validation for amount of sales
            if(i>=0)
            	{purchase.setAmountOfSales(i);break;}
            else 
            	System.out.println("Wrong entry,enter again");
        }
        
        purchase.display();
    }
}