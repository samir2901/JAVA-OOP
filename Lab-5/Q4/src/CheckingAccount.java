public class CheckingAccount {    
    int accountNumber;
    int balance;  
    public CheckingAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        if(balance < 200){
            this.balance = 0;
        }else{
            this.balance = balance;
        }        
    }
    
    public void getAccountDetails(){
        System.out.println("Account Number: " + this.accountNumber);
        if(this.balance == 0){
            System.out.println("Balance: " + this.balance);            
            System.out.println("Minimum 200$ is required for account");            
        }else{
            System.out.println("Balance: " + this.balance);            
        }
    }       
}
