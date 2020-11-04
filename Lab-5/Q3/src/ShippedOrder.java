public class ShippedOrder extends Order{

    public ShippedOrder(String customerName, int customerNo, int quantityOrdered, int unitPrice) {
        super(customerName, customerNo, quantityOrdered, unitPrice);
    }
    
    public int computePrice(int quantity){
        int price = super.computePrice(quantity);
        return price + 4;
    }
}
