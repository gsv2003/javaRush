package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by user on 19.11.15.
 */
class Singleton
{
    private Singleton()
    {

    }

    private static Singleton sin1;

    static Singleton getInstance()
    {
        if (sin1 == null)
        {
            sin1 = new Singleton();
            return sin1;
        }else
        {
            return sin1;
        }

    }
}
