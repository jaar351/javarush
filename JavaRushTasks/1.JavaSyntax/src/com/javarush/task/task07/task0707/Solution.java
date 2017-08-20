package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList s = new ArrayList();
//        for (int i =0; i<5; i++){
//            s.add("бла" + i);
//        }
        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("five");
        System.out.println(s.size());
        for(int i =0; i < s.size();i++){
            System.out.println(s.get(i));
        }
    }
}
