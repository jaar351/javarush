package com.javarush.task.task08.task0814;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> mySet = new HashSet<>();
        for (int x = 0; x < 20; x++) {
            mySet.add(x);
        }
        return mySet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        ArrayList<Integer> myArr = new ArrayList<>();

        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> mySet = createSet();
        removeAllNumbersMoreThan10(mySet);
    }
}
