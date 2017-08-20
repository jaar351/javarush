package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
        String sB= reader.readLine();
        int b = Integer.parseInt(sB);
        String sC= reader.readLine();
        int c = Integer.parseInt(sC);

        int one;
        int two;
        int three;
// one
        if (a < b){
            one = a;
        }
        else {
            one = b;
        }
        if (one > c){
            one = c;
        }


//one
// two
        if (a > b) {
            three = a;
        }
        else{
            three = b;
        }
        if (c > three){
            three = c;
        }
        two = (a + b + c) - (one + three);
        System.out.println(one + " " + two + " " + three);
    }
}
