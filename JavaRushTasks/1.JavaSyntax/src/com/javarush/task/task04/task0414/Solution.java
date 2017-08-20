package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static int Year ()throws Exception {
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 String sYear = reader.readLine();
 int iYear = Integer.parseInt(sYear);
 return iYear;
    }

    public static void main(String[] args) throws Exception {
    double year = Year();
    if ((year%4 == 0)&&(year%400 == 0)&&(year%100 == 0)){
        System.out.println("366");
    }
    else{
        System.out.println("365");
    }
    }
}