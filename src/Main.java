public class Main {
    public static void main(String[] args) {

        //EXAMPLE WITH POSITIVE PRICE AND QUANTITY
        Invoice myInvoice = new Invoice("OP101", "Some small part of something", 2, 12);

        System.out.println("A) Part number to be purchased: " + myInvoice.getPartNumber());
        System.out.println("A) Quantity: " + myInvoice.getQuantity());
        System.out.println("A) Price per item: " + myInvoice.getPrice());
        System.out.println("A) The total amount for myInvoice is: " + myInvoice.getInvoiceAmount() + " Euros");
        System.out.println();


        //EXAMPLE WITH NEGATIVE PRICE AND QUANTITY
        Invoice myInvoice2 = new Invoice("OP202", "Another small part of something", -2, -12);

        System.out.println("B) Part number to be purchased: " + myInvoice2.getPartNumber());
        System.out.println("B) Quantity: " + myInvoice2.getQuantity());
        System.out.println("B) Price per item: " + myInvoice2.getPrice());
        System.out.println("B) The total amount for myInvoice2 is: " + myInvoice2.getInvoiceAmount() + " Euros");
        System.out.println();


        //EXAMPLE WITH POSITIVE PRICE AND NEGATIVE QUANTITY
        Invoice myInvoice3 = new Invoice("OP303", "One more small part of something", 3, -5);

        System.out.println("C) Part number to be purchased: " + myInvoice3.getPartNumber());
        System.out.println("C) Quantity: " + myInvoice3.getQuantity());
        System.out.println("C) Price per item: " + myInvoice3.getPrice());
        System.out.println("C) The total amount for myInvoice2 is: " + myInvoice3.getInvoiceAmount() + " Euros");
    }
}