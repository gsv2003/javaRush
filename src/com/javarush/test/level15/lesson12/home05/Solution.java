package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution()
    {

    }
    public Solution (int i){

    }
    public Solution (double d)
    {

    }

    private Solution (Integer i)
    {

    }
    private Solution (Double d)
    {

    }
    private Solution (String s)
    {

    }

    protected Solution (int i, double d)
    {

    }
    protected Solution(double d, int i)
    {

    }
    protected Solution (float f, int i)
    {

    }

    Solution(Object o)
    {

    }

    Solution(Number num)
    {

    }
    Solution (Float f)
    {

    }

}

