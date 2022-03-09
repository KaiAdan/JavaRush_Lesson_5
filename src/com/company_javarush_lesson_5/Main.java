package com.company_javarush_lesson_5;

import com.company_javarush_lesson_5.lesson_5.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.company_javarush_lesson_5.lesson_5.classAndConstructor.summ.allSum;
import static com.company_javarush_lesson_5.lesson_5.extraTasks.*;

public class Main {

    public static void main(String[] args) {
        //    task1_2
//        classAndConstructor.Cat cat1 = new classAndConstructor.Cat();
//        cat1.name = "catVasya";
//        cat1.age = 3;
//        cat1.weight = 5;
//        cat1.strenght = 8;
//
//        classAndConstructor.Cat cat2 = new classAndConstructor.Cat();
//        cat2.name = "catBars";
//        cat2.age = 5;
//        cat2.weight = 8;
//        cat2.strenght = 9;
//
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));



        //    task1_3
//        classAndConstructor.Dog dog = new classAndConstructor.Dog();
//        dog.setName("Juchka");
//        dog.setAge(6);
//        System.out.println(dog.getName() + " " + dog.getAge());


        //    task1_4
        //В методе main создать три объекта типа Cat и заполнить их данными.
        // Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
//        classAndConstructor.Cat cat1 = new classAndConstructor.Cat();
//        cat1.name = "catVasya";
//        cat1.age = 3;
//        cat1.weight = 5;
//        cat1.strenght = 8;
//
//        classAndConstructor.Cat cat2 = new classAndConstructor.Cat();
//        cat2.name = "catBars";
//        cat2.age = 5;
//        cat2.weight = 8;
//        cat2.strenght = 9;
//
//        classAndConstructor.Cat cat3 = new classAndConstructor.Cat();
//        cat3.name = "catMurka";
//        cat3.age = 2;
//        cat3.weight = 4;
//        cat3.strenght = 6;


        //    task1_5
        //    Создать три кота используя класс Cat.
        //    Провести три боя попарно между котами.
        //    Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
        //    Результат каждого боя вывести на экран.

//        classAndConstructor.Cat cat1 = new classAndConstructor.Cat();
//        cat1.name = "catVasya";
//        cat1.age = 3;
//        cat1.weight = 5;
//        cat1.strenght = 8;
//
//        classAndConstructor.Cat cat2 = new classAndConstructor.Cat();
//        cat2.name = "catBars";
//        cat2.age = 5;
//        cat2.weight = 8;
//        cat2.strenght = 9;
//
//        classAndConstructor.Cat cat3 = new classAndConstructor.Cat();
//        cat3.name = "catMurka";
//        cat3.age = 2;
//        cat3.weight = 4;
//        cat3.strenght = 6;
//
//        boolean fight_1 = cat1.fight(cat2);
//        if (fight_1){
//            System.out.println(cat1.name + " WINNER!!! " + cat2.name + " looser!");
//        }
//        else {
//            System.out.println(cat2.name + " WINNER!!! " + cat1.name + " looser!");
//        }
//        boolean fight_2 = cat1.fight(cat3);
//        if (fight_2){
//            System.out.println(cat1.name + " WINNER!!! " + cat3.name + " looser!");
//        }
//        else {
//            System.out.println(cat3.name + " WINNER!!! " + cat1.name + " looser!");
//        }
//        boolean fight_3 = cat2.fight(cat3);
//        if (fight_3){
//            System.out.println(cat2.name + " WINNER!!! " + cat3.name + " looser!");
//        }
//        else {
//            System.out.println(cat3.name + " WINNER!!! " + cat2.name + " looser!");
//        }



        //    task4_1
//        classAndConstructor.Duck duck1 = new classAndConstructor.Duck();
//        classAndConstructor.Duck duck2 = new classAndConstructor.Duck();
//        System.out.println(duck1);
//        System.out.println(duck2);
//
//        classAndConstructor.Cat_4_1 cat = new classAndConstructor.Cat_4_1();
//        classAndConstructor.Cat_4_1 cat1 = new classAndConstructor.Cat_4_1();
//        System.out.println(cat);
//        System.out.println(cat1);
//
//        classAndConstructor.Dog_4_1 dog = new classAndConstructor.Dog_4_1();
//        classAndConstructor.Dog_4_1 dog1 = new classAndConstructor.Dog_4_1();
//        System.out.println(dog);
//        System.out.println(dog1);



        //    task4_2
//        classAndConstructor.Solution.Man man1 = new classAndConstructor.Solution.Man("man1", "Moscow", 32);
//        System.out.println(man1.name + " " + man1.age + " " + man1.addres);
//        classAndConstructor.Solution.Man man2 = new classAndConstructor.Solution.Man("man2", "Berlin", 56);
//        System.out.println(man2.name + " " + man2.age + " " + man2.addres);
//
//        classAndConstructor.Solution.Woman woman1 = new classAndConstructor.Solution.Woman("woman1", "London", 27);
//        System.out.println(woman1.name + " " + woman1.age + " " + woman1.addres);
//        classAndConstructor.Solution.Woman woman2 = new classAndConstructor.Solution.Woman("woman2", "Vegas", 16);
//        System.out.println(woman2.name + " " + woman2.age + " " + woman2.addres);



        //    task4_3
//        classAndConstructor.Dog_4_3 dog1 = new classAndConstructor.Dog_4_3("Buldog", true, 75);
//        classAndConstructor.Cat_4_3 cat1 = new classAndConstructor.Cat_4_3("Tom", false, 90);


        //    task4_4
//    Вывести на экран текущую дату в аналогичном виде «21 06 2015».
//        Date date = new Date();
//        SimpleDateFormat formatDate = new SimpleDateFormat("dd MM yyyy");
//        System.out.println(formatDate.format(date));



        //    task4_5
//        System.out.println(allSum());

        //    task5_1
//        sum2();

        //    task5_2
//        min5();

        //    task5_3
        maxForN();


    }
}
