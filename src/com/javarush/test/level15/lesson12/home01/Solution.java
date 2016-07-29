package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        while (!s.equals("exit")){
            try
            {
                if (s.contains("."))
                {
                    print (Double.parseDouble(s));
                }else if(Integer.parseInt(s) >= 128)
                {
                    print(Integer.parseInt(s));
                }else if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128)
                {
                    print (Short.parseShort(s));
                }else
                {
                    print (s);
                }

            }catch (NumberFormatException e)
            {
                print (s);
            }
            s = reader.readLine();
        }
        reader.close();
    }

        /*while (!s.equals("exit"))
        {
            if (s.contains("."))
            {
                try
                {
                    print(Double.parseDouble(s));
                }catch (NumberFormatException e)
                {
                    print(s);
                }
            } else if (isNumber(s) && Short.parseShort(s) > 0 && Short.parseShort(s) < 128)
            {
                print ((short)Integer.parseInt(s));
            }else if (isNumber(s) && Integer.parseInt(s) >= 128)
            {
                print (Integer.parseInt(s));
            }else
                print (s);
            s = reader.readLine();
        }
        reader.close();

    }

    public static boolean isNumber(String string) {
        if (string == null || string.length() == 0) return false;

        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }

        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }*/

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
