public class Celsius_to_Fah {
    static float convert(float tempC){
        float tempF;
        tempF = (tempC * 9f/5.0f) + 32.0f;
        return tempF;
    }
    public static void main(String[] args) {
        float x = convert(-40f);
        System.out.println(x);
    }    
}