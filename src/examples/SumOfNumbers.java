package examples;

public class SumOfNumbers {
    public static int getSum(int a, int b) {
        if(a < b) {
            int sum = 0;
            for(int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        }
        else if(b < a) {
            int sum = 0;
            for(int i = b; i <= a; i++) {
                sum += i;
            }
            return sum;
        }
        else return a;
    }
    
    public static void main(String[] args) {
        System.out.println(getSum(-1, 2));
    }
}
