package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);


        if (a > 0 && ( a%2 == 0)){
            System.out.println("положительное четное число");
        }
        if (a < 0 && ( a%2 == 0)){
            System.out.println("отрицательное четное число");
        }
        if (a > 0 && ( a%2 != 0)){
            System.out.println("положительное нечетное число");
        }
        if (a < 0 && ( a%2 != 0)){
            System.out.println("отрицательное нечетное число");
        }
        if (a == 0){
            System.out.println("ноль");
        }
    }
}
