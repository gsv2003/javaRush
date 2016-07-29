package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static int[] createArray(int dimension)
    {
        int[] array = new int[dimension];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(createArray(5));
        list.add (createArray(2));
        list.add (createArray(4));
        list.add(createArray(7));
        list.add (createArray(0));
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
