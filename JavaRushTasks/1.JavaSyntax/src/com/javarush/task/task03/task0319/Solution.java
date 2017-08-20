package com.javarush.task.task03.task0319;

/* 
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
«Имя» получает «число1» через «число2» лет.

Пример:
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
        String secAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int tAge = Integer.parseInt(secAge); //преобразовываем строку в число.

    }
}
