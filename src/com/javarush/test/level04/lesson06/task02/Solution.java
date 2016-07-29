package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        max4(n1, n2, n3, n4);

    }
    public static int max(int a, int b)
    {
        int nMax;
        if (a < b)
            nMax = b;
        else
            nMax = a;
        return nMax;
    }
    private static void max4(int a, int b, int c, int d)
    {
        System.out.println(max(max(a, b), max(c, d)));
    }
}
