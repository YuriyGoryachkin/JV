package com.company;

import java.util.Scanner;   // встроенный класс для работы с вводом данных

public class input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    // создание объекта для ввода зачений, "приглашение к вводу"
            System.out.print("Input a number: ");
        int num = in.nextInt(); // ввод значения
        /*
        next() : считывает введённую строку до первого пробела
        nextLine() : считывает всю введённую строку
        nextInt() : считывает введённое число int
        nextDouble() : считывает введённое число double
        nextBoolean() : считывает значение boolean
        nextByte() : считывает введённое число byte
        nextFloat() : считывает введённое число float, ввод значения с учётом локализации
        nextShort() : считывает введённое число short
         */
            System.out.printf("Your number: %d\n", num);
        System.out.print("Input float:\t");
        float num2 = in.nextFloat();
        float num3 = 2.5f;
        float sum = num2 + num3;
        float proiz = num2*num3;
        System.out.printf("num2(',') + num3('.') = %f\n", sum);
        System.out.println("num2(',') * num3('.') = " + proiz);

    }
}
