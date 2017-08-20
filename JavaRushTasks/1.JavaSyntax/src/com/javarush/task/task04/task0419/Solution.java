package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        String sD= reader.readLine();
        int d = Integer.parseInt(sD);


        int x = 0;
        if(a > b){
            x = a;
        }
        else {
            x = b;
        }
        if (c > x){
            x = c;
        }
        else if (d > x){
            x = d;
        }
    }
}
