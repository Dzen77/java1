package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    private void sift() {
        for (int i = 2; i < sieve.length; ++i) {
            for (int j = 2; i * j < sieve.length; ++j) {
                sieve[i * j] = false;
            }
        }
    }
    public boolean isSimple(int n) {
            return sieve[n];
    }
    public Eratosthenes(int n){
            sieve = new boolean[n];//Инициализация массива
            Arrays.fill(sieve, true);//Заполнение массива значениями
            sift();
    }
    public static void main(String[] args) {

    }
}