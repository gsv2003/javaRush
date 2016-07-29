package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    private String name;
    private double growth;
    private String color;

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, double growth){
        this.name = name;
        this.growth = growth;
    }

    public Dog(String name, double growth, String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

}
