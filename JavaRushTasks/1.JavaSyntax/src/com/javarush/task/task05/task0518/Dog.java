package com.javarush.task.task05.task0518;

/* 
— Имя
— Имя, рост
— Имя, рост, цвет
*/


public class Dog {
    String name;
    int height;
    String color;


    public Dog(String n){
        name = n;
    }
    public Dog(String n, int h){
        name = n;
        height = h;
    }
    public Dog(String n, int h, String c){
        name = n;
        height = h;
        color = c;
    }

    public static void main(String[] args) {

    }
}
