package com.company_javarush_lesson_5.lesson_5;

import java.util.Scanner;

public class extraTasks {
    //    task5_1
//    Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
    public static void sum2(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
    //    task5_2
//    Старая Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
//    Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
    public static void min5(){
        int minimal = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int input = scanner.nextInt();
            if (i == 0){
                minimal = input;
            }
            else {
                if (input < minimal){
                    minimal = input;
                }
            }
        }
        System.out.println(minimal);
    }



    //    task5_3
//      Задача: Написать программу, которая:
//      1. вводит с консоли число N > 0
//      2. потом вводит N чисел с консоли
//      3. выводит на экран максимальное из введенных N чисел.
    public static void maxForN(){
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        for (int i = 0; i < steps; i++){
            int temp = scanner.nextInt();
            if (i == 0){
                max = temp;
            }
            else {
                if (temp > max){
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
