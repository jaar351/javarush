package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] twenty = new int[20];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        //int a = Integer.parseInt(r.readLine());

        for (int i = 0; i < twenty.length; i++){
            twenty[i] = Integer.parseInt(r.readLine());
        }

        return twenty;
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
