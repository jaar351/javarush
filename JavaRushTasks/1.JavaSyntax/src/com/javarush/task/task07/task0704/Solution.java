package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int[] num = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<num.length; i++){
            num[i] = Integer.parseInt(r.readLine());
        }
        for (int i = 1; i <= num.length; i++){
            System.out.println(num[num.length-i]);
        }
    }
}

