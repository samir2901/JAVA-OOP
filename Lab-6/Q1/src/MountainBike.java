public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    
    @Override
    public String toString() {
        String x = "Bike having " + this.getGear() + " gears and speed is " + this.getSpeed() + " and seat height is " + this.seatHeight; 
        return x;
    }      
        
}
