class Print{
    public void print(String msg){        
            System.out.println(msg);        
    }
}

class LoudHailer extends Thread{
    private String msg;
    Print print;

    public LoudHailer(String msg, Print print) {
        this.msg = msg;
        this.print = print;
    }

    @Override
    public void run() {
        synchronized(print){
            print.print(this.msg);
        }              
    }   
    
}


public class Main {    
    public static void main(String[] args) {
        Print print = new Print();
        
        LoudHailer t1 = new LoudHailer("Good",print);
        LoudHailer t2 = new LoudHailer("Morning",print);
        LoudHailer t3 = new LoudHailer("Kolkata",print);
        
                
        t1.start();
        t2.start();
        t3.start();   
    }    
}
