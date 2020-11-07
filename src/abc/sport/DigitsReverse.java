package abc.sport;

public class DigitsReverse {
    static int addAsStrings(int n1, int n2) {
        String a = Integer.toString(n1);
        String b = Integer.toString(n2);
        String d = a + b;
        int d1 = Integer.parseInt(d);
        return d1;
    }
    public static void main(String[] args) {
        int x = 27;
        int y = 3;
        int z = addAsStrings(x, y);
        System.out.println(z);
    }
}
