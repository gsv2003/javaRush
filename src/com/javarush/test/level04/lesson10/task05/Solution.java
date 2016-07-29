package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int count1 = 1;
        while (count1 <= 10){
            int count2 = 1;
            while (count2 <= 10){
                System.out.print(count2 * count1 + " ");
                count2++;
            }
            System.out.println();
            count1++;
        }

    }
}
