import java.io.*;

public class MyFileManager {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("numbers.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while (s != null) {
                double x = Double.parseDouble(s);
                if(x < 0){
                    throw new NegativeNumberException(x);
                }else
                {
                    System.out.println(x);
                }
                s = br.readLine();
            }
        }catch (FileNotFoundException e) {
            System.err.println("Unable to find requested file.");
        } catch (IOException e){
            System.err.println("Unable to perform IO operations.");
        } catch (NegativeNumberException e) {
            System.err.println(e);
        }
    }
}
