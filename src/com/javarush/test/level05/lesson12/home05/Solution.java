package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isSum = true;
        int count = 0;
        while(isSum){
            String sSummand = reader.readLine();
            if (sSummand.equals("сумма")){
                isSum = false;
                break;
            }
            int nSummand = Integer.parseInt(sSummand);
            count += nSummand;
        }
        System.out.println(count);
    }
}
