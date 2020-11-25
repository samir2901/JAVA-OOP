package banking;

public abstract class Accounts {    
    int cust_id;
    String cust_name;
    double balance;
    
    public Accounts(int cust_id, String cust_name, double balance) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.balance = balance;
    }    

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }  

    public int getCust_id() {
        return cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }
    
    
    
    public abstract void display();
}
