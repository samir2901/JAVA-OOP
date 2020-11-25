package banking.savings;

import banking.Accounts;

public class SavAcc extends Accounts{
    double dwl;

    public SavAcc(double dwl, int cust_id, String cust_name) {
        super(cust_id, cust_name, 1000);
        this.dwl = 500;
    }    
    
    public SavAcc(int cust_id, String cust_name, double balance){
        super(cust_id, cust_name, balance);        
        dwl = 0.5 * balance;
    }    
    
    public void withdraw(double amount){
        double bal = this.getBalance();
        if(bal - amount >= 1000 && amount <= dwl){            
            this.setBalance(bal - amount);
        }
    }
    
    public void deposit(double amount){
        this.setBalance(this.getBalance() + amount);        
    }        

    @Override
    public void display() {
        System.out.println("ID:" + this.getCust_id());
        System.out.println("Name:" + this.getCust_name());
        System.out.println("Balance:" + this.getBalance());                     
    }    
}
