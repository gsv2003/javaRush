package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] iArr = new int[10];
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        for (int i = 0; i < iArr.length; i++)
        {
            iArr[i] = Integer.parseInt(reader.readLine());
        }

        /*for (int i = 0; i < iArr.length - 1; i++)
        {
            for (int j = 0; j < iArr.length - 1; j++)
            {
                if(iArr[j] < iArr[j+1])
                {
                    int c = iArr[j];
                    iArr[j] = iArr[j+1];
                    iArr[j+1] = c;
                }
            }
        }*/
        int[] temp = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++)
        {
            temp[i] = iArr[(iArr.length - 1) - i];
        }

        for (int i: temp)
        {
            System.out.println(i);
        }

    }
}