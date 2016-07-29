package com.javarush.test.level14.lesson06.home01;

/**
 * Created by user on 18.11.15.
 */
class BelarusianHen extends Hen
{
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS+ ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    int getCountOfEggsPerMonth()
    {
        return 20;
    }

}
