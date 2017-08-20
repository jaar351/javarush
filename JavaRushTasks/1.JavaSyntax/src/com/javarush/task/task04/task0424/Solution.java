package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (b == c && (a * 2) != (b + c)) {
                System.out.println("1");
        }
        if (a == b && (2*c) != (a + b)) {
            System.out.println("3");
        }
        if (a == c && (b * 2) != (a + c)){
            System.out.println("2");
        }

    }
}
