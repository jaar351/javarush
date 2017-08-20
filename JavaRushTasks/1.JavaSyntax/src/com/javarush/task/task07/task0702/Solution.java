package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        PrintMas();

    }

    public static void PrintMas () throws Exception{
        String[] ten = new String[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i =0; i < 8;i++ ){
            ten[i] = r.readLine();
        }
        for (int i=1; i<= ten.length; i++){
            System.out.println(ten[ten.length-i]);
        }
    }
}