package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 18.11.15.
 */
class RussianHen extends Hen
{
    String getDescription()
    {
        return super.getDescription() + " Моя страна - "+Country.RUSSIA+". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    int getCountOfEggsPerMonth()
    {
        return 25;
    }
}
