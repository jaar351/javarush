package com.javarush.task.task04.task0412;

/* 
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
*/

import java.io.*;

public class Solution {
    public static int NumberFromKeyboard() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringNumb = reader.readLine();
        int Inumber = Integer.parseInt(stringNumb);
        return Inumber;
    }



    public static void main(String[] args) throws Exception {
        int num = NumberFromKeyboard();
        if (num > 0){
            num = num * 2;
        }
        else if (num < 0) {
            num = num + 1;

        }

        System.out.println(num);
    }

}