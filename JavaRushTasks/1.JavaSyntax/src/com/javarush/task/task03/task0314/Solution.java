package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        Multiplication();
    }

    public static void Multiplication() {
        int i;
        for (i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                int b = i * a;
                System.out.print(b + " ");
            }
          System.out.println("");
        }
    }
}