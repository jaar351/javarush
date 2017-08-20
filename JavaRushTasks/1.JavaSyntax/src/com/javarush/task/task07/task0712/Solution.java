package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String > words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i =0; i<10; i++){
            words.add(reader.readLine());
        }

        int max = words.get(0).length();
        int min = words.get(0).length();
        for (int i = 0; i < words.size();i++){
            if (words.get(i).length() < min){
                min = words.get(i).length();
            }
            else if (words.get(i).length() > max){
                max = words.get(i).length();
            }
        }

        for(int i = 0; i<words.size(); i++){
            if (words.get(i).length() == min || words.get(i).length() == max){
                System.out.println(words.get(i));
                break;
            }
        }
    }
}
