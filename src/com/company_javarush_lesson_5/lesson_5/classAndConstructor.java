package com.company_javarush_lesson_5.lesson_5;

import java.util.Scanner;

public class classAndConstructor {

//    task1_1
//Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
    public static class Cat {
        public String name;
        public int age;
        public int weight;
        public int strenght;
//    task1_2
//    Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса, возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
//    Должно выполняться условие:
//    если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
        public boolean fight(Cat anotherCat){
            boolean result = false;
            int totalStrenghtCat = this.age + this.weight + this.strenght;
            int totalStrenghtEnemy = anotherCat.age + anotherCat.weight + anotherCat.strenght;
            if (totalStrenghtCat > totalStrenghtEnemy){
                result = true;
            }
            return result;
        }
}
//    task1_3
//    Создать class Dog. У собаки должна быть кличка String name и возраст int age.
//    Создайте геттеры и сеттеры для всех переменных класса Dog.
    public static class Dog{
        private String name;
        private int age;

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
    }
}

//    task1_4
//В методе main создать три объекта типа Cat и заполнить их данными.
// Использовать класс Cat из первой задачи. Класс Cat создавать не надо.


//    task1_5
//    Создать три кота используя класс Cat.
//    Провести три боя попарно между котами.
//    Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
//    Результат каждого боя вывести на экран.


    //    task2_1
//    Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
//    - Имя
//    - Имя, возраст
//    - Имя, возраст, пол
    public static class Friend{

        private String name;
        private int age;
        private String sex;

        public void initialize(String name){
            this.name = name;
        }

        public void initialize(int age, String name ){
            this.name = name;
            this.age = age;
        }

        public void initialize(int age, String name, String sex ){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

    }

    //    task2_2
//    Создать класс Cat (кот) с пятью инициализаторами:
//    - Имя
//    - Имя, вес, возраст
//    - Имя, возраст (вес стандартный)
//    - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
//    - вес, цвет, адрес (чужой домашний кот)
//
//    Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
//    Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

    public static class Cat_2_2{
        private String name;
        private int weight = 2;
        private  int age = 1;
        private String color = "gray";
        private String addres;

        public void initialize(String name){
            this.name = name;
        }
        public void initialize(String name, int weight, int age){
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void initialize(String color, int weight, String addres, int age){
            this.color = color;
            this.weight = weight;
        }
        public void initialize(String color, int weight, String addres){
            this.addres = addres;
            this.color = color;
            this.weight = weight;
        }

    }


    //    task2_3
//    Создать класс Dog (собака) с тремя инициализаторами:
//    - Имя
//    - Имя, рост
//    - Имя, рост, цвет
    public static class Dog_2_3{
        private String name;
        private String color;
        private int height;

        public void initialize(String name){
            this.name = name;
        }
        public void initialize(String name, int height){
            this.name = name;
            this.height = height;
        }
        public void initialize(String name, int height, String color){
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }

    //    task2_4
//    Создать класс (Circle) круг, с тремя инициализаторами:
//    - centerX, centerY, radius
//    - centerX, centerY, radius, width
//    - centerX, centerY, radius, width, color
    public static class Circle{
        private int centerX;
        private int centerY;
        private int radius;
        private int width;
        private String color;

        public void initialize(int centerX, int centerY, int radius){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }
        public void initialize(int centerX, int centerY, int radius, int width){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }
        public void initialize(int centerX, int centerY, int radius, int width, String color){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }

    }

    //    task2_5
//    Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
//    Создать для него как можно больше методов initialize(…)
//    Примеры:
//    - заданы 4 параметра: left, top, width, height
//    - ширина/высота не задана (оба равны 0)
//    - высота не задана (равно ширине) создаём квадрат
//    - создаём копию другого прямоугольника (он и передаётся в параметрах)
    public static class Rectangle{
        private int top;
        private int left;
        private int width;
        private int height;

        public void initialize(){
            this.top = 1;
            this.left = 1;
            this.width = 1;
            this.height = 1;
        }
        public void initialize(int top, int left, int width, int height){
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }
        public void initialize(int top, int left, int width){
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = width;
        }
        public void initialize(Rectangle rectangle){
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }


    //    task3_1
//    Создать класс Friend (друг) с тремя конструкторами:
//    - Имя
//    - Имя, возраст
//    - Имя, возраст, пол
    public static class Friend_3_1{
        private String name;
        private int age;
        private String sex;

        public Friend_3_1(String name){
            this.name = name;
        }
        public Friend_3_1(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Friend_3_1(String name, int age, String sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }

    //    task3_2
//    Создать класс Cat (кот) с пятью инициализаторами:
//    - Имя
//    - Имя, вес, возраст
//    - Имя, возраст (вес стандартный)
//    - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
//    - вес, цвет, адрес (чужой домашний кот)
//
//    Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
//    Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

    public static class Cat_3_2{
        private String name;
        private int weight = 2;
        private  int age = 1;
        private String color = "gray";
        private String addres;

        public Cat_3_2(String name){
            this.name = name;
        }
        public Cat_3_2(String name, int weight, int age){
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
        public Cat_3_2(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Cat_3_2(String color, int weight, String addres, int age){
            this.color = color;
            this.weight = weight;
        }
        public Cat_3_2(String color, int weight, String addres){
            this.addres = addres;
            this.color = color;
            this.weight = weight;
        }

    }

    //    task3_3
//    Создать класс Dog (собака) с тремя инициализаторами:
//    - Имя
//    - Имя, рост
//    - Имя, рост, цвет
    public static class Dog_3_3{
        private String name;
        private String color;
        private int height;

        public Dog_3_3(String name){
            this.name = name;
        }
        public Dog_3_3(String name, int height){
            this.name = name;
            this.height = height;
        }
        public Dog_3_3(String name, int height, String color){
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }

    //    task3_4
//    Создать класс (Circle) круг, с тремя инициализаторами:
//    - centerX, centerY, radius
//    - centerX, centerY, radius, width
//    - centerX, centerY, radius, width, color
    public static class Circle_3_4{
        private int centerX;
        private int centerY;
        private int radius;
        private int width;
        private String color;

        public Circle_3_4(int centerX, int centerY, int radius){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }
        public Circle_3_4(int centerX, int centerY, int radius, int width){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }
        public Circle_3_4(int centerX, int centerY, int radius, int width, String color){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }

    }

    //    task3_5
//    Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
//    Создать для него как можно больше методов initialize(…)
//    Примеры:
//    - заданы 4 параметра: left, top, width, height
//    - ширина/высота не задана (оба равны 0)
//    - высота не задана (равно ширине) создаём квадрат
//    - создаём копию другого прямоугольника (он и передаётся в параметрах)
    public static class Rectangle_3_5{
        private int top;
        private int left;
        private int width;
        private int height;

        public Rectangle_3_5(){
            this.top = 1;
            this.left = 1;
            this.width = 1;
            this.height = 1;
        }
        public Rectangle_3_5(int top, int left, int width, int height){
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }
        public Rectangle_3_5(int top, int left, int width){
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = width;
        }
        public Rectangle_3_5(Rectangle rectangle){
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    //    task4_1
//    По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
//    Подумай, что должен возвращать метод toString в классах Cat и Dog?
//    В методе main создай по два объекта каждого класса и выведи их на экран.
//    Объекты класса Duck уже созданы и выводятся на экран.

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Cat_4_1 {
        public String toString(){
            return "Cat";
        }
    }

    public static class Dog_4_1 {
        public String toString() {
            return "Dog";
        }
    }

    //    task4_2
//      1. Внутри класса Solution создай public static классы Man и Woman.
//      2. У классов должны быть поля: name(String), age(int), address(String).
//      3. Создай конструкторы, в которые передаются все возможные параметры.
//      4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
//      5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
    public static class Solution{
        public static class Man{
            public String name;
            public String addres;
            public int age;

            public Man(String name, String addres, int age){
                this.name = name;
                this.addres = addres;
                this.age = age;
            }

        }
        public static class Woman{
            public String name;
            public String addres;
            public int age;

            public Woman(String name, String addres, int age){
                this.name = name;
                this.addres = addres;
                this.age = age;
            }
        }
    }
    //    task4_3
//    Добавь по три поля в каждый класс, на твой выбор.
//    Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
//
//    Пример:
//    Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см) , 5 (длина хвоста, см))
    public static class Dog_4_3{
        public String name;
        public Boolean luck;
        public int height;

        public Dog_4_3(String name, Boolean luck, int height){
            this.name = name;
            this.luck = luck;
            this.height = height;
        }
    }

    public static class Cat_4_3{
        public String name;
        public Boolean luck;
        public int height;

        public Cat_4_3(String name, Boolean luck, int height){
            this.name = name;
            this.luck = luck;
            this.height = height;
        }
    }

    //    task4_4
//    Вывести на экран текущую дату в аналогичном виде «21 06 2015».
//    В main


    //    task4_5
//    Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
    public static class summ{
        public static int allSum(){
            int sum = 0;
            String exit = "сумма";
            String inp = "0";
            while (!inp.equals(exit)){
                Scanner scanner = new Scanner(System.in);
                inp = scanner.nextLine();
                if (!inp.equals(exit)){
                    int number = Integer.parseInt(inp);
                    sum += number;
                }
                else {
                    break;
                }
            }
            return sum;
        }
    }
}
