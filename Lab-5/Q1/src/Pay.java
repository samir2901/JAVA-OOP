
import java.util.Scanner;

public class Pay {
    private double hoursWorked;
    private double payRate;
    private double withHoldingRate;
    private double grossPay;
    private double netPay;
    
    double computeNetPay(double hoursWorked){
        this.hoursWorked = hoursWorked;
        this.payRate = 5.85;
        this.grossPay = 5.85 * hoursWorked;
        this.withHoldingRate = 0.15;
        this.netPay = this.grossPay - (this.grossPay * 0.15);
        return this.netPay;
    }
    double computeNetPay(double hoursWorked, double payRate){
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.grossPay = payRate * hoursWorked;
        this.withHoldingRate = 0.15;
        this.netPay = this.grossPay - (this.grossPay * 0.15);
        return this.netPay;
    }
    double computeNetPay(double hoursWorked, double payRate, double withHoldingRate){
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.grossPay = payRate * hoursWorked;
        this.withHoldingRate = withHoldingRate;
        this.netPay = this.grossPay - (this.grossPay * withHoldingRate);
        return this.netPay;
    } 
    
    public static void main(String[] args) {
        double hrs, rate, withHolding;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter worked hours:");
        hrs = sc.nextDouble();
        System.out.println("Enter rate:");
        rate = sc.nextDouble();
        System.out.println("Enter with holding rate:");
        withHolding = sc.nextDouble();
        
        Pay p1 = new Pay();
              
        System.out.println("Using only one parameter: " + p1.computeNetPay(hrs));
        System.out.println("Using only two parameter: " + p1.computeNetPay(hrs,rate));
        System.out.println("Using only three parameter: " + p1.computeNetPay(hrs,rate,withHolding));
    }
    
}
