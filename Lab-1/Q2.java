import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice: ");
        char choice = sc.next().charAt(0);
        sc.close();       
        if ((choice == 'A') || (choice == 'a')) {
            System.out.println("Action movie fan");
        }else if((choice == 'C') || (choice == 'c')){
            System.out.println("Comedy movie fan");
        }else if((choice == 'D') || (choice == 'd')){
            System.out.println("Drama movie fan");
        }else{            
            System.out.println("Invalid choice");            
        }
    }    
}