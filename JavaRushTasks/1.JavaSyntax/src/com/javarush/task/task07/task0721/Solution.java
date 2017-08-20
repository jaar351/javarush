package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numM = new int[20];
        for(int i=0;i<numM.length;i++){
            numM[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = numM[0];
        int minimum= numM[0];

        for(int i=0;i<numM.length;i++){
            if(numM[i]<minimum){
                minimum = numM[i];
            }
            else if(numM[i]>maximum){
                maximum = numM[i];
            }
        }


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
