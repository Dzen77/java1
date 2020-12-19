package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber) {
        int i;
        int result = 0;
        byte x = value;
        for (i=0;i<=bitNumber;i++){
            result += x & 00000001;
            if (i == bitNumber) {
                break;
            } else {
                result = 0;
                x = (byte) (x >> 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        byte value = (byte)0b10001001;
        int bitNumber = 7;
        System.out.println(checkBit(value, bitNumber));
    }
}
