public class Order {
    private String customerName;     
    private int customerNo;
    private int quantityOrdered;
    private int unitPrice;
    private int totalPrice;        
    
    public Order(String customerName, int customerNo, int quantityOrdered, int unitPrice) {
        this.customerName = customerName;
        this.customerNo = customerNo;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;        
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
    
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }    

    public int computePrice(int quantity){
        this.quantityOrdered = quantity;
        this.totalPrice = this.quantityOrdered * this.unitPrice;
        return this.totalPrice;
    }    
    
}
