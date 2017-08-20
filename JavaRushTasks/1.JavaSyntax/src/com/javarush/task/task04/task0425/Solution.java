package com.javarush.task.task04.task0425;

/* 
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
        String sB = reader.readLine();
        int b = Integer.parseInt(sB);

    if (a > 0 && b > 0){
        System.out.println("1");
    }
    if (a < 0 && b > 0){
        System.out.println("2");
    }
    if (a < 0 && b < 0){
        System.out.println("3");
    }
    if ( a > 0 && b < 0){
        System.out.println("4");
    }
    }
}
