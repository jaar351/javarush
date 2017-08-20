package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numberList = new ArrayList<>();
        int max = 0;
        int maxCounter = 0;



        for(int i=0; i<10; i++){

            int number = Integer.parseInt(reader.readLine());
            numberList.add(number);

            if(numberList.get(i-1) == number ){
                maxCounter++;
            }
            else {
                if(maxCounter > max){
                    max = maxCounter;
                }

                maxCounter = 0;}
            }
        System.out.println(max);
    }
}