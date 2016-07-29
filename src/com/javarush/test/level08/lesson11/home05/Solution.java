package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char c;
        String result = "";
        //напишите тут ваш код
        if (s.charAt(0) != ' ')
        {
            c = s.charAt(0);
            c = Character.toUpperCase(s.charAt(0));
            result += c;
        }
        for (int i = 1; i < s.length(); i++)
        {
                if (s.charAt(i-1) == ' ' && s.charAt(i) != ' ')
                {
                    c = s.charAt(i);
                    c = Character.toUpperCase(s.charAt(i));
                    result += c;
                }
                else
                    result += s.charAt(i);
        }
        System.out.println(result);
    }


}
