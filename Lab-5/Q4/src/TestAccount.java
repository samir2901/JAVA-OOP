import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter balance: ");
        int balance = sc.nextInt();
        CheckingAccount acc = new CheckingAccount(accountNumber, balance);
        acc.getAccountDetails();
    }    
}
