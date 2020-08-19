import java.text.DecimalFormat;

public class Q1 {
    public static void main(String[] args) {
        float[] x;
        x = new float[4];   
        x[0] = Float.parseFloat(args[0]);
        x[1] = Float.parseFloat(args[1]);
        x[2] = Float.parseFloat(args[2]);
        x[3] = Float.parseFloat(args[3]);
        for (int i = 0; i < x.length-1; i++) {
            for (int j = 0; j < x.length-i-1; j++) {
                if(Float.compare(x[j],x[j+1]) > 0){
                    float t = x[j];
                    x[j] = x[j+1];
                    x[j+1] = t;
                }                                
            }                       
        }
        float s = new Float(0);
        for (int i = 0; i < x.length; i++) {
            s = Float.sum(s,x[i]);
        }
        DecimalFormat dFormat = new DecimalFormat("##.00");
        for (int i = 0; i < x.length; i++) {
            System.out.print(dFormat.format(x[i]) + " ");            
        }
        System.out.println();         
        System.out.println(dFormat.format(s));
    }        
}