package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10.
Результат — это 1 число.


*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(multiplic());

    }
    public static int multiplic(){
        int b = 1;
        for (int i = 1; i<11; i++){
           b  = b * i;
        }
      return b;
    }
}
