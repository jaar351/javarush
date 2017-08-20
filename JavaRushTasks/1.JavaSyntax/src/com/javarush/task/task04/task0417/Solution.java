package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
        String sB = reader.readLine();
        int b = Integer.parseInt(sB);
        String sC = reader.readLine();
        int c = Integer.parseInt(sC);


        if ((a == b )&& (b == c)) {
            System.out.println(a + b + c);
        }
        else if (a == b){
                System.out.println( a + b);
            }
        else if (b == c){
                System.out.println(b + c);
            }
        else if (a == c){
                System.out.println(a + c);
            }


    }
}