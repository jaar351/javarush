package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

        public static class Man {
            String name;
            int age;
            String address;

            public Man(String n, int a, String ad) {
                name = n;
                age = a;
                address = ad;
            }
        }

        public static class Woman {
            String name;
            int age;
            String address;

            public Woman(String n, int a, String ad) {
                name = n;
                age = a;
                address = ad;
            }
        }

    public static void main(String[] args) {
        Man man1 = new Man("Slava", 25, "K");
        Man man2 = new Man("S", 55, "s");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("n", 85, "q");
        Woman woman2 = new Woman("qw", 7, "qwedfb");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }
}
