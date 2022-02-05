package Assignment1;

public class Purchase
{
    int invoiceNumber;
    int amountOfSales;
    double amountOfSalesTax;
    static double rate=5.0;
    
    public void setInvoiceNumber(int i)
    {
        invoiceNumber=i;
    }
    public void setAmountOfSales(int a)
    {
        amountOfSales=a;
        amountOfSalesTax=(5.0*a)/100;
    }
    public void display()
    {
        System.out.println("***Invoice Details***");
        System.out.println("Invoice Number: "+invoiceNumber);
        System.out.println("Amount of Sales: "+amountOfSales);
        System.out.println("Amount of sales tax: "+amountOfSalesTax);
    }
}

// Arun David (300347125)
