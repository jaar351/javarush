package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);

        if (a%2 == 0 && sA.length() == 1){
            System.out.println("четное однозначное число");
        }
        if (a%2 != 0 && sA.length() == 1){
            System.out.println("нечетное однозначное число");
        }
        if (a%2 == 0 && sA.length() == 2){
            System.out.println("четное двузначное число");
        }
        if (a%2 != 0 && sA.length() == 2){
            System.out.println("нечетное двузначное число");
        }
        if (a%2 == 0 && sA.length() == 3){
            System.out.println("четное трехзначное число");
        }
        if (a%2 != 0 && sA.length() == 3){
            System.out.println("нечетное трехзначное число");
        }

    }
}
