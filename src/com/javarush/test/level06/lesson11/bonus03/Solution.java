package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int[] numArr = new int[5];

        for (int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(reader.readLine());
        }

        sortNumArr(numArr);

        for (int i = 0; i < numArr.length; i++)
        {
            System.out.println(numArr[i]);
        }
    }

    public static void sortNumArr(int[] numberArr){
        for (int i = 0; i < numberArr.length; i++)
        {
            for (int j = 0; j < numberArr.length - 1; j++)
            {
                if (numberArr[j] > numberArr[j+1])
                {
                    int c = numberArr[j];
                    numberArr[j] = numberArr[j+1];
                    numberArr[j+1] = c;
                }
            }

        }
    }
}
