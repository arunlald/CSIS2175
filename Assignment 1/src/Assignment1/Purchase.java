package Assignment1;

import java.util.Scanner;
public class Purchase
{
    int invoiceNumber;
    int amountOfSale;
    double amountOfSalesTax;
    static double rate=5.0;
    
    Scanner s = new Scanner(System.in);
    
    public void setInvoiceNumber(int i)
    {
		
		 while (i<=1000 || i>=8000) {
		 System.out.println("Please enter a valid invoice number: ");
		 i=s.nextInt(); }
		 
		 invoiceNumber=i;
		 
		 //this.invoiceNumber=i;
		                
     // user input validation for invoice number
		/*
		 * if(i>=1000 && i<=8000){ invoiceNumber=i;} else {
		 * System.out.println("Please enter a valid invoice number!!!");
		 * 
		 * }
		 */
   }
    
    public void setAmountOfSales(int a)
    {
           
     // user input validation for amount of sales
        
		
		 while (a<0) {
		 System.out.println("Please enter a non-negative sales value: ");
		 a=s.nextInt(); }
		 amountOfSalesTax=(5.0*a)/100;
		 amountOfSale=a;
		
		 //this.amountOfSale=a; 
		 
		
		 /*if(a>=0) { amountOfSalesTax=(5.0*a)/100;} else {
		 System.out.println("Please enter a valid purchase amount!!!"); }
		 
        }*/
    }  
    
    public void display()
    {
        System.out.println("***Invoice Details***");
        System.out.println("Invoice Number: "+invoiceNumber);
        System.out.println("Amount of Sales: "+amountOfSale);
        System.out.println("Amount of sales tax: "+amountOfSalesTax);
    }
}

// Arun David (300347125)


