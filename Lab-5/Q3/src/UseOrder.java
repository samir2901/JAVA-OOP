public class UseOrder {
    public static void main(String[] args) {
        Order order = new Order("Sam", 34809, 10, 40);
        System.out.println("Customer Number: " + order.getCustomerNo());
        System.out.println("Name: " + order.getCustomerName());
        System.out.println("Quantity Ordered: " + order.getQuantityOrdered());
        System.out.println("Unit Price: " + order.getUnitPrice());
        System.out.println("Total: " + order.computePrice(order.getQuantityOrdered()));
        
        System.out.println("\n");
        
        ShippedOrder shippedOrder = new ShippedOrder("John", 34325, 20, 30);
        System.out.println("Customer Number: " + shippedOrder.getCustomerNo());
        System.out.println("Name: " + shippedOrder.getCustomerName());
        System.out.println("Quantity Ordered: " + shippedOrder.getQuantityOrdered());
        System.out.println("Unit Price: " + shippedOrder.getUnitPrice());
        System.out.println("Total: " + shippedOrder.computePrice(shippedOrder.getQuantityOrdered()));
    }    
}
