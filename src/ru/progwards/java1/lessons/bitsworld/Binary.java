package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte aNum;
    public Binary(byte num) {
        aNum = num;
    }
    public String toString() {
        String result = "";
        while (aNum > 0) {
            int z = aNum % 2;
            result = z + result;
            aNum /= 2;
        }
        if (result.isEmpty())
            return "0";
        return result;
    }
    public static void main(String[] args) {
        Binary bin = new Binary((byte) 27);
        System.out.println(bin);
    }
}
