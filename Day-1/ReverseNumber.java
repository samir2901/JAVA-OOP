public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        int reversed = 0;
        while (num!=0) {
            int n = num%10;
            reversed = reversed*10 + n;
            num /= 10;
        }
        System.out.println(reversed);
    }
    
}