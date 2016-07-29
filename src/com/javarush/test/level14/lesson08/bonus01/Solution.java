package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            int[]  i =  {1, 2, 3};
            int num = i[4];

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try
        {
            double i = 1 / 0;
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Integer num = new Integer(" ");
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] i = null;
            int q = i[0];
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] i = {1, 2};
            int v = i[-1];
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            double i = 1 / 0;
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            double i = 1 / 0;
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            double i = 1 / 0;
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            double i = 1 / 0;
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            double i = 1 / 0;
        }catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
