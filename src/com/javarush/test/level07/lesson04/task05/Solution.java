package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] iArr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < iArr.length; i++)
        {
            iArr[i] = Integer.parseInt(reader.readLine());
        }
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        for (int i = 0; i < iArr1.length; i++)
        {
            iArr1[i] = iArr[i];
        }
        for (int i = 0; i < iArr2.length; i++)
        {
            iArr2[i] = iArr[iArr2.length + i];
        }
        for (int i: iArr2)
        {
            System.out.println(i);
        }

    }
}
