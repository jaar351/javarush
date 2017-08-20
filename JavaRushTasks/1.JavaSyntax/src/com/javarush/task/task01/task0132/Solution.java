package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sotni = number/100;
        int desjatki = (number - sotni*100)/10;
        int edinicq = (number - sotni*100 - desjatki*10);
        int summa = (sotni + desjatki + edinicq);
        return summa;

    }
}