package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int[] nArr = new int[3];
        nArr[0] = Integer.parseInt(reader.readLine());
        nArr[1] = Integer.parseInt(reader.readLine());
        nArr[2] = Integer.parseInt(reader.readLine());
        sort(nArr);

    }
    public static void sort(int[] numArray)
    {
        for (int i = 0; i < numArray.length; i++){
            for (int j = 0; j < (numArray.length - 1); j++){
                if (numArray[j] < numArray[j+1]){
                    int c = numArray[j];
                    numArray[j] = numArray[j+1];
                    numArray[j+1] = c;
                }
            }
        }
        for (int i = 0; i < numArray.length; i++){
            System.out.print (numArray[i] + " ");
        }
    }
}
