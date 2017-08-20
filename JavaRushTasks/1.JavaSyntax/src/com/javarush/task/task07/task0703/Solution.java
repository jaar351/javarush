package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] words = new String[10];
        int[] numb = new int[10];

        for (int i=0; i<words.length; i++){
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            words[i] = r.readLine();
            numb[i] = words[i].length();
        }
        for (int i = 0; i<numb.length; i++){
            System.out.println(numb[i]);
        }
    }
}
