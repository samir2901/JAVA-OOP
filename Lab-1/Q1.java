import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter Y: ");
        int y = sc.nextInt();
        sc.close();
        if(x > 0 && y > 0){
            System.out.println("Quadrant 1");
        }else if(x < 0 && y > 0){
            System.out.println("Quadrant 2");
        }else if(x < 0 && y < 0){
            System.out.println("Quadrant 3");
        }else{
            System.out.println("Quadrant 4");
        }                
    }    
}