package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

       for(int i = 0; i<5; i++){
           s.add(r.readLine());
       }

        for (int i =0; i<13; i++){
            s.add(0, s.get(s.size()-1));
            s.remove(s.size()-1);
        }

        for (int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
        }
    }
}
