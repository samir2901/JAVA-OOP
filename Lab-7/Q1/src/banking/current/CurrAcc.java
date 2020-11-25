package banking.current;

import banking.Accounts;

public class CurrAcc extends Accounts{

    public CurrAcc(int cust_id, String cust_name, double balance) {
        super(cust_id, cust_name, balance);
    }
    
    /**
     * Withdraws the indicated amount from the current account
     * requires amount is of type double and amount > 0 and amount <= balance
     * modifies: balance
     * effects: amount is subtracted from balance, resulting balance
     * returns: true if withdrawal successful, false otherwise
     * @param amount 
     */
    
    public boolean withdraw(double amount){
        double bal = this.getBalance();
        double current = bal - amount;
        if(current <= 0 || amount >= bal){
            return false;
        }else{
            this.setBalance(current);
            return true;
        }
    }
    
    public void deposit(double amount){
        if(amount >= 10000){
            this.setBalance(this.getBalance() + amount);        
        }
    }           
    
    
    @Override
    public void display() {
        System.out.println("ID:" + this.getCust_id());
        System.out.println("Name:" + this.getCust_name());
        System.out.println("Balance:" + this.getBalance());                             
    }
    
}
