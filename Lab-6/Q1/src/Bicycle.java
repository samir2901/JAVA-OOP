public class Bicycle {
    public int gear;
    public int speed;
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }    
     public int getGear() {
        return this.gear;
    }

    public int getSpeed() {
        return this.speed;
    }    
    public void putBrakes(int decrement){
        this.speed-=decrement;
    }
    public String toString(){
        String x = "Bike having " + this.gear + " gears and speed is " + this.speed; 
        return x;
    }
}