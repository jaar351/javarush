package com.javarush.task.task05.task0517;

/* 

*/

public class Cat {
    String name = null;
    int age = 5;
    int weight = 8;
    String address = null;
    String color = "grey";

    public Cat(String n){
        name = n;
    }
    public Cat(String n, int w, int a){
        name = n;
        weight = w;
        age = a;
    }
    public Cat (String n, int a){
        name = n;
        age = a;
    }
    public Cat(int w, String c){
        weight = w;
        color = c;
    }
    public Cat(int w, String c, String a){
        weight = w;
        color = c;
        address = a;
    }




    public static void main(String[] args) {

    }
}
