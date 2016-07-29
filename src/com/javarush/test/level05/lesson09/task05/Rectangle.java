package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    private double top;
    private double left;
    private double width = 0.0;
    private double height = 0.0;

    public Rectangle(double top, double left, double width, double height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double top, double left){
        this.top = top;
        this.left = left;
    }

    public Rectangle(double top, double left, double width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle(Rectangle anotherRectangle){
        this.top = anotherRectangle.top;
        this.left = anotherRectangle.left;
        this.width = anotherRectangle.width;
        this.height = anotherRectangle.height;
    }

}
