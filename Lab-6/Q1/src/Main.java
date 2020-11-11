import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;        
        MountainBike mbk = new MountainBike(4, 50, 2);
        System.out.println(mbk.toString());        
        System.out.println("Enter decrement value: ");
        int dec = sc.nextInt();
        mbk.putBrakes(dec);
        System.out.println(mbk.toString());        
    }
}
