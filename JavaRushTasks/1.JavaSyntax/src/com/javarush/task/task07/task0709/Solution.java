package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            s.add(r.readLine());
        }

        int min = s.get(0).length();

        for (int i = 0; i < s.size(); i++){
            if (s.get(i).length() < min){
                min = s.get(i).length();
            }
        }
        for(int i =0; i<s.size(); i++){
            if(s.get(i).length() == min){
                System.out.println(s.get(i));
            }
        }
    }
}
