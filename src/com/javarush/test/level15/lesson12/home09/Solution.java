package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int i = url.indexOf("?");
        url = url.substring(i+1);

        String[] params = url.split("&");
        String[] paramsWithObj = url.split("&");

        for (int j = 0; j < params.length; j++)
        {
            if (params[j].contains("="))
            {
                params[j] = params[j].substring(0, params[j].indexOf("="));
            }
        }

        for (String s : params)
        {
            System.out.print(s + " ");
        }
        System.out.println();

        for (String s: paramsWithObj)
        {
            if (s.startsWith("obj="))
            {
                try
                {
                    alert (Double.parseDouble(s.substring(4)));
                }catch(Exception e)
                {
                    alert(s.substring(4));
                }


            }
        }



    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
