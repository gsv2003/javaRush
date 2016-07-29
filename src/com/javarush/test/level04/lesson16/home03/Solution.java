package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        boolean isNegativeOne = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (isNegativeOne){
            int n1 = Integer.parseInt(reader.readLine());
            if (n1 == -1)
                isNegativeOne = false;
            count += n1;
        }
        System.out.println(count);
    }
}
