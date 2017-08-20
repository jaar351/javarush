package com.javarush.task.task05.task0513;

/* 
Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    int left = 0;
    int top = 0;
    int width = 0;
    int height = 0;

    public void initialize (int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize (int left, int top){
        this.left = left;
        this.top = top;
    }
    public void initialize (int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize (int topt){
        this.top = top;
    }

    public static void main(String[] args) {

    }
}