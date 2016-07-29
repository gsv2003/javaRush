package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        boolean isNegative = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        while (isNegative)
        {
            number = Integer.parseInt(reader.readLine());
            if (number <= 0)
                System.out.println("Введите число больше нуля!");
            else
                isNegative = false;
        }
        //напишите здесь ваш код

        int[] numArr = new int[number];

        for (int i = 0; i < number; i++){
            numArr[i] = Integer.parseInt(reader.readLine());
        }

        sortNumArr(numArr);

        System.out.println(numArr[0]);
    }

    public static void sortNumArr(int[] numberArr){
        for (int i = 0; i < numberArr.length; i++)
        {
            for (int j = 0; j < numberArr.length - 1; j++)
            {
                if (numberArr[j] < numberArr[j+1])
                {
                    int c = numberArr[j];
                    numberArr[j] = numberArr[j+1];
                    numberArr[j+1] = c;
                }
            }

        }
    }
}
