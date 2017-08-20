package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String sA = reader.readLine();
            int a = Integer.parseInt(sA);
            if (a == -1){
                break;
            }
            i =  i + a;
        }
        System.out.println(i/2);
    }
}

