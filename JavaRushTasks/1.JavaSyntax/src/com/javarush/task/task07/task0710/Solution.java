package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i =0; i<10; i++){
            s.add(0, r.readLine());
        }
        for(int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
        }
    }
}
