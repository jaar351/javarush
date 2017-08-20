package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();
        ArrayList<Integer> numOthers = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<20; i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        for(int i = 0; i<numbers.size();i++){
            if(numbers.get(i)%3==0 || numbers.get(i)%2==0) {
                if (numbers.get(i) % 2 == 0) {
                    num2.add(numbers.get(i));
                }if (numbers.get(i) % 3 == 0) {
                    num3.add(numbers.get(i));
                }
            }
            else{
                numOthers.add(numbers.get(i));
            }
        }
        printList(num3);
        printList(num2);
        printList(numOthers);

    }

    public static void printList(List<Integer> list) {
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
