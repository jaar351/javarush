package com.javarush.task.task04.task0422;

/*
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sName = reader.readLine();
        String sAge= reader.readLine();
        int age = Integer.parseInt(sAge);

        if (age > 20){
            System.out.println("И 18-ти достаточно");
        }
    }
}