package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String stringA = reader.readLine();
    int a = Integer.parseInt(stringA);
    String stringB = reader.readLine();
    int b = Integer.parseInt(stringB);
    String stringC = reader.readLine();
    int c = Integer.parseInt(stringC);

    if(((a+b)>c) && ((a+c)>b) && (c+b)>a){
        System.out.println("Треугольник существует.");
    }
    else{
        System.out.println("Треугольник не существует.");
    }
    }
}