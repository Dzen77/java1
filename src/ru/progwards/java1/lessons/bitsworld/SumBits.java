package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {
        int summ = 0;
        int i;
        for (i=0;i<9;i++){
            summ += value & 00000001;
            value += value >> 1;
            return summ;
        }
        return 0;
    }
    public static void main(String[] args) {
        byte value = (byte)0b00010010;
        int result = sumBits(value);
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }
}
