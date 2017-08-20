package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> s = new ArrayList<>();
        ArrayList<String> sLong = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));


        for (int i =0; i <5; i++){
            s.add(r.readLine());
        }
        int maxL = 0;
        for(int i =0; i < s.size();i++){
            if(maxL < s.get(i).length()){
//                sLong = new ArrayList<>();
//                sLong.add(s.get(i));
//                maxL = s.get(i).length();
                maxL = s.get(i).length();
            }
//            else if (maxL == s.get(i).length()){
//                sLong.add(s.get(i));
//            }
        }
        for(int i =0; i<s.size();i++){
            if ( s.get(i).length() == maxL){
                System.out.println(s.get(i));
            }

        }

    }
}
