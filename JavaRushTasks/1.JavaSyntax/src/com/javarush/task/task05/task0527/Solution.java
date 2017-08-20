package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat catTom = new Cat("Tom", 58, 12);
        Dog dogSpike = new Dog("Spike", 105, 3);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

        public static class Dog{
            String name;
            int height;
            int tail;

        public Dog(String n, int h, int t){
            name = n;
            height = h;
            tail = t;
            }
        }

        public static class Cat{
            String name;
            int height;
            int tail;

            public Cat(String n, int h, int t){
                name = n;
                height = h;
                tail = t;
            }
        }
}
