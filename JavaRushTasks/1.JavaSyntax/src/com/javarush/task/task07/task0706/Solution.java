package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение — число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывеси на экран сообщение: «В домах с нечетными номерами проживает больше жителей.» или «В домах с четными номерами проживает больше жителей.»

Примечание:
дом с порядковым номером 0 считать четным.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int[] house = new int[15];
       int even = 0;
       int odd = 0;
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

       for(int i = 0; i<house.length;i++){
           house[i] = Integer.parseInt(r.readLine());
       }

       for (int i =0; i<house.length;i+=2){
           even += house[i];
       }

       for (int i =1; i < house.length; i+=2){
           odd += house[i];
       }
       if (even > odd) {
           System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else {
           System.out.println("В домах с нечетными номерами проживает больше жителей.");
       }


    }
}
