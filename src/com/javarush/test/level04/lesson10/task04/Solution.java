package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int count1 = 0;
        while (count1 < 10){
            int count2 = 0;
            while (count2 < 10){
                System.out.print('S');
                count2++;
            }
            System.out.println();
            count1++;
        }
    }
}
