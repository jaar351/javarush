package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int summa = 0;

       while (true){
           String sA = reader.readLine();
           if (sA.equals("сумма")){
               break;
           }

           int a = Integer.parseInt(sA);
           summa = summa + a;


        }
        System.out.println(summa);
    }
}
