package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader  r = new BufferedReader(new InputStreamReader(System.in));
        String sA = r.readLine();
        double aAbs = Math.abs(Double.parseDouble(sA)); // модуль числа с клавиатуры
        double daAbs = aAbs;


//        while (true){
//           int iaAbs = (int)daAbs;
//           if (daAbs/iaAbs == 1){
//               break;
//           }
//           daAbs = daAbs * 10;
//        }

        double multiplier = 1.0;
        while (true) {
            long intAbs = (long)(daAbs * multiplier);
            if ((daAbs * multiplier)%intAbs > 0.0) {
                multiplier = multiplier * 10;
            }else {
                daAbs = daAbs * multiplier;
                break;
            }
        }

            long finalaAbs = (long)daAbs;
            for (long i = 1; ; i = i * 10) {
                long divA = finalaAbs / i;
                if (divA >= 1) {
                    if ((divA % 2) == 0) {
                        even = even + 1;
                    } else {
                        odd = odd + 1;

                    }
                } else {
                    break;
                }
            }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
