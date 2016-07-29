package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child0 = new Human("Joly", false, 7, null);
        Human child1 = new Human("PolStep", false, 6, null);
        Human child2 = new Human("MatStep", true, 1, null);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child0);
        children.add(child1);
        children.add(child2);
        Human father = new Human("StepVik", true, 29, children);
        ArrayList<Human> fArr = new ArrayList<Human>();
        fArr.add(father);
        Human mother = new Human("AnnGer", false, 36, children);
        ArrayList<Human> mArr = new ArrayList<Human>();
        mArr.add(mother);
        Human grandPa1 = new Human("GerGer", true, 59, mArr);
        Human grandPa2 = new Human("VinStep", true, 68, fArr);
        Human grandMa1 = new Human("LyuYur", false, 62, mArr);
        Human grandMa2 = new Human("LyuZal", false, 62, fArr);

        System.out.println(child0);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandPa1);
        System.out.println(grandPa2);



    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (children == null)
            {
                this.children = new ArrayList<Human>();
            }
            else this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }else
            text += ", нет детей";

            return text;
        }
    }

}
