
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoudHailer extends Thread{
    private String msg;

    public LoudHailer(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoudHailer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }   
    
}
