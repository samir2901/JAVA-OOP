import java.util.*;
public class UseHotelRoom {
    public static void main(String [] args) {
		int smallRoom;
		int bigRoom;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the small Room no: ");
		smallRoom = sc.nextInt();
		System.out.println("Enter the big Room no: ");
		bigRoom = sc.nextInt();
		
		HotelRoom h1 = new HotelRoom(smallRoom);
		System.out.println("Hotel Room No: " + h1.getRoomNo() + " Rental Rate: " + h1.getRentalRate());
		
		HotelRoom h2 = new HotelRoom(bigRoom);
		System.out.println("Hotel Room No: " + h2.getRoomNo() + " Rental Rate: " + h2.getRentalRate());
		
		Suite s1 = new Suite(smallRoom);
		System.out.println("Hotel Room No: " + s1.getRoomNo() + " Rental Rate: " + s1.getRentalRate());
		
		Suite s2 = new Suite(bigRoom);
		System.out.println("Hotel Room No: " + s2.getRoomNo() + " Rental Rate: " + s2.getRentalRate());
	}
}
