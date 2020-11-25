package banking;

import banking.current.CurrAcc;
import banking.savings.SavAcc;

public class Bank {
    public static void main(String[] args) {
        //Savings Account
        SavAcc savingAcc = new SavAcc(1234, "John", 5000);
        System.out.println("-----------------FOR SAVINGS ACCOUNT-----------------");
        System.out.println("INITIAL STATE----");
        savingAcc.display();
        System.out.println("WITHDRAWAL----");
        System.out.println("Withdrawn 100");
        savingAcc.withdraw(100);
        savingAcc.display();
        System.out.println("DEPOSITING----");
        System.out.println("Depositing 7000");
        savingAcc.deposit(7000);
        savingAcc.display();           
        
        
        CurrAcc currentAcc = new CurrAcc(32432, "Will Smith", 34500);
        System.out.println("-----------------FOR CURRENT ACCOUNT-----------------");
        System.out.println("INITIAL STATE----");
        currentAcc.display();
        System.out.println("WITHDRAWAL----");
        System.out.println("Withdrawn 4500");
        currentAcc.withdraw(4500);
        currentAcc.display();
        System.out.println("DEPOSITING----");
        System.out.println("Depositing 900");
        currentAcc.deposit(900);
        currentAcc.display();
    }    
}
