package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    public static void main(String[] args) {
        System.out.println(labels);
    }

    static
    {
        labels.put(1.0, "first");
        labels.put(2.0, "second");
        labels.put(3.0, "third");
        labels.put(4.0, "fourth");
        labels.put(5.0, "fifth");
    }
}
