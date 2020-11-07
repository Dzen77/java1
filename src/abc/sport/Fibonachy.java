package abc.sport;

public class Fibonachy {
    public static int fiboNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int n0 = 1;
        int n1 = 1;
        int n2 = 1;
        for(int i = 3; i <= n; i++){
            n2=n0+n1;
            n0=n1;
            n1=n2;
        }
        return n2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fiboNumber(n));
    }
}
