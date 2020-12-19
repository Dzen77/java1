package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {
        int summ = 0;
        int i;
        byte x = value;
        for (i=1;i<8;i++){
                summ += x & 00000001;
                x = (byte)(x >> 1);
            }
        return summ;
    }
    public static void main(String[] args) {
        byte value = (byte)0b01100110;
        int result = sumBits(value);
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }
}