package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte aNum;
    int len;
    public Binary(byte num) {
        aNum = num;
    }
    public String toString() {//Метод который возвращает двоичное представление числа типа byte
        String result = "";//Переменная где накапливается результат работы цикла
        for (int i = 0; i < 8; i++) {
            result =  (((aNum & 1) == 0) ? "0" : "1") + result;
            aNum = (byte)(aNum >> 1);
        }
        if (result.isEmpty())//Необходима если aNum на вхде в программу имеет значение <=0
            return "00000000";

        return result;
    }
    public static void main(String[] args) {
        byte y = (byte)-12;
        Binary bin = new Binary(y);
        System.out.println(bin);
    }
}
