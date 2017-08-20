package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sA = reader.readLine();
            String sB= reader.readLine();

            if (sA.equals(sB)){
                System.out.println("Имена идентичны");
            }
            if (sA.length() == sB.length()){
                System.out.println("Длины имен равны");
            }


    }
}
