public class NegativeNumberException extends Exception{
    double num;
    public NegativeNumberException(double n){
        this.num = n;
    }

    @Override
    public String toString() {
        return "NegativeNumberException{" +
                "num=" + num +
                '}';
    }
}
