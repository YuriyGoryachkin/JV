package com.company;

/*
комментарии
*/
public class hello {
    public static void main (String[] args){
        float x = 5f;   // обязательно указание символа 'f', иначе значение рассматривается как double
        int y = 10, z = 20;
        int a;
        var b = 3;
        float s;
        double k;
        final int LIMIT = 8; // константа
        long num = 2147483649L; // обязательно указание символ 'L' привыходе за диапазон
        char ch1 = 'e';
        char ch2 = 102; // символ 'f'
        char ch3 = '\u0066'; // символ 'f' в 16-тиричной форме
        String hello = "Hello";
        /*
        boolean: true или false
        byte: целое от -128 до 127 и занимает 1 байт
        short: целое от -32768 до 32767 и занимает 2 байта
        int: целое от -2147483648 до 2147483647 и занимает 4 байта
        long: целое от -9223372036854775808 до 9223372036854775807 и занимае 8 байт
        double: с плавающей точкой от +-4,9*10^-324 до +-1,8*10^308 и занимает 8 байт, разделитель 'точка'
        float: с плавающей точкой от -3,4*10^38 до 3,4*10^34 и занимает 4 байта
        char: одиночный символ в кодировке UTF-16 и занимает 2 байта, от 0 до 65536
        int num111 = 0x6F // в 16-тиричной форме после '0x'
        int num8 = 010 // в 8-ричной форме после '0'
        int num13 = 0b1101 // в 2-ичной форме после '0b'
         */
        a = 1;
        s = (x + y - (a * b))/z;
        System.out.println(hello + "!");
        System.out.println("Welcome to Java!");
        System.out.println("LIMIT = " + LIMIT);
        System.out.println("(x + y - a * b ) / z = " + s);
        System.out.println("num = " + num);
        x = 123_456;    // разделение разрядов
        y = 123_456__789;
        System.out.println("x(123_456) = " + x);
        System.out.println("y(123_456__789) = " + y);
        System.out.println("ch1('e') = " + ch1);
        System.out.println("ch2(102) = " +ch2);
        System.out.println("ch3('u0066') = " + ch3);
        System.out.println("println1");
        System.out.println("println2");
        System.out.print("print1");
        System.out.print("print2");
        System.out.print("\nprint3\n");
        System.out.println("x= " + x + "; y= " + y);
        /*
        Форматированный вывод (printf)
        %d - целое число
        %x - 16-тиричное число
        %f - число с плавающей точкой, указание кол-ва знаков после запятой '%.2f'
        %e - число в экспоненциальной форме
        %c - одиночный символ
        %s - строковое значение
         */
        System.out.printf("printf: x=%.2f; y=%d\n", x, y);
        k = 10/4;
        System.out.println("k(10/4) = " + k);
        k = 10.0/4;
        System.out.println("k(10.0/4) = " + k);
    }
}
