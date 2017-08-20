package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int[] bigMas = new int[20];
       int[] smallOne = new int[10];
       int[] smallTwo = new int[10];
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

       for (int i =0; i<bigMas.length; i++){
           bigMas[i] = Integer.parseInt(r.readLine());
       }

       for(int i = 0; i<smallOne.length; i++){
           smallOne[i] = bigMas[i];
       }
       for(int i = 0; i<smallTwo.length; i++){
           smallTwo[i] = bigMas[i+10];
        }
        for (int i = 0; i<smallTwo.length;i++){
            System.out.println(smallTwo[i]);
        }

    }
}
