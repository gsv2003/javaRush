package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("First string");
        list.add("Second string");
        list.add("Third string");
        list.add("Fourth string");
        list.add("Fifth string");
        System.out.println(list.size());
        for (String s: list)
        {
            System.out.println(s);
        }

    }
}
