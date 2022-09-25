public class Invoice {
    private String partNumber;
    private String partDescription;
    private int price;
    private int quantity;

    public Invoice() {
    }

    public Invoice(String partNumber, String partDescription, int price, int quantity) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            price = 0;
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            quantity = 0;
        }
        this.quantity = quantity;
    }

    public int getInvoiceAmount() {
        int invoiceTotal;
        invoiceTotal = quantity * price;

        return invoiceTotal;
    }
}
