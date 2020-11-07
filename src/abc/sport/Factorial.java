package abc.sport;

public class Factorial {
    public static void main(String[] args) {
        long n1 = 10;
        long result = factorial(n1);
        System.out.println("Факториал " + n1 + " = " + result);
    }
    static long factorial(long n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
