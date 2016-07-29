package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private Human father;
        private Human mother;

        //1
        public Human()
        {

        }

        //2
        public Human (String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        //3
        public Human (String name, String surname, int age, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        //4
        public Human (String name, String surname, int age, boolean sex, Human father, Human mother)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        //5
        public Human (int age, boolean sex)
        {
            this.name = "Ivan";
            this.surname = "Ivanov";
            this.age = age;
            this.sex = sex;
        }

        //6
        public Human (Human father, Human mother)
        {
            this.name = "Petr";
            this.surname = "Petrov";
            this.age = 0;
            this.sex = true;
            this.father = father;
            this.mother = mother;
        }

        //7
        public Human (String name, String surname, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.sex = sex;

        }

        //8
        public Human (String name, String surname, int age)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        //9
        public Human (String name, int age, boolean sex)
        {
            this.name = name;
            this.surname = "Ivanov";
            this.age = age;
            this.sex = sex;
        }

        //10
        public Human (String surname, int age)
        {
            this.name = "Ivan";
            this.surname = surname;
            this.age = age;
        }

    }
}
