package abc.sport;

public class Sport {

    static int addAsStrings(int n1, int n2) {
        Integer x = n1;
        String n1Str = Integer.toString(x);
        Integer y = n2;
        String n2Str = Integer.toString(y);
        String result = n1Str + n2Str;
        int end = Integer.valueOf(result);
        return end;
    }
    public static void main(String[] args) {
        byte zero = 125;
        short zero1 = zero;
        int zero2 = zero1;
        long zero3 = zero2;
        float zerof = zero2;
        double zerod = zerof;
        System.out.println(addAsStrings(1, 2));// Первая строчка
        System.out.println(addAsStrings(3, 5));// Вторая строчка
        System.out.println("Приведение примитивных Переменных младших типов к Переменным старших типов");
        System.out.println(zero + ", " + zero1 + ", " + zero2 + ", " + zero3 + ", " + zerof + ", " + zerod);// Третья строчка
        int x = zero;
        double y = x;
        System.out.println("Тип int приведенный из byte - " + x + ", " + "Тип double приведенный из int - " + y);// Четвертая строчка
        System.out.println("");
        System.out.println("Приведение примитивных Переменных старших типов к Переменным младших типов");
        long xl = 124l;
        int gi = (int)xl;
        short gsh = (short)gi;
        byte gb = (byte)gsh;
        System.out.println(xl + ", " + gi + ", " + gsh + ", " + gb);
        byte r = (byte)gi;
        byte r1 = (byte)xl;
        System.out.println("Тип byte приведенный из int - " + r + ", " + "Тип byte приведенный из long - " + r1);
        double znakd = 2821111111111111111111111111111111111159.87;
        float znakf = (float)znakd;
        int znaki = (int)znakd;
        byte znakb = (byte)znakd;
        System.out.println("");
        System.out.println("Приведение типа double к типу float и double к int");
        System.out.println("Для примера берем число типа double - " + znakd);
        System.out.println("Тип float приведенный из double - " + znakf + ", " + "Тип int приведенный из double - " + znaki);
        System.out.println("Приведение типа double к типу byte - " + znakb);
    }
}
