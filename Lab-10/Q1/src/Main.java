public class Main {    
    public static void main(String[] args) {
        LoudHailer t1 = new LoudHailer("Good");
        LoudHailer t2 = new LoudHailer("Morning");
        LoudHailer t3 = new LoudHailer("Kolkata");
        
        t3.setPriority(2);
        
        t1.start();
        t2.start();
        t3.start();   
    }    
}
