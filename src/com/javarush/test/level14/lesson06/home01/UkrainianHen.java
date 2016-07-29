package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 18.11.15.
 */
class UkrainianHen extends Hen
{
    String getDescription()
    {
        return super.getDescription() + " Моя страна - "+ Country.UKRAINE+". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    int getCountOfEggsPerMonth()
    {
        return 5;
    }
}
