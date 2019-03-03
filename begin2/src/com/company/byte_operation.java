package com.company;

public class byte_operation {
    public static void main (String[] args){
        /*
        byte b = 7; // 0000 0111
        short s = 7;    // 0000 0000 0000 0111
        */
        int a1 = 2; // 010
        int b1 = 5; // 101
        System.out.println("2&5(логическое умножение) = " + (a1&b1));
        int a2 = 4; // 100
        int b2 = 5; // 101
        System.out.println("4&5(логическое умножение) = " + (a2&b2));
        System.out.println("Если значение разрядов обоих чисел равно '1', то операция возвращает '1', иначе '0'");
        System.out.println("2|5(логическое сложение) = " + (a1|b1));
        System.out.println("4|5(логическое сложение) = " + (a2|b2));
        System.out.println("Возвращает '1', если хотя бы у одного числа в данном разряде имеется '1'");
        int number = 45;    // 1001
        int key = 102;  // 1100110
        int encrypt = number^key;   // 1001011 или 75
        int decrypt = encrypt^key;  // 1001 или 45
        System.out.println("45^102(логическое исключающее XOR) = " + encrypt);
        System.out.println("75^102 = " + decrypt);
        System.out.println("Если значение текущего разряда у обоих чисел разные,");
        System.out.println("то возвращается '1', иначе '0'");
        byte inv = 12;  // 0000 1100
        System.out.println("~12(логическое отрицание) = " + (~inv));
        System.out.println("Инвертирует все разряды числа");
        int ab = 4; // 100
        int ba = 1;
        System.out.printf("ab = %d; ba = %d\n", ab, ba);
        System.out.println("ab<<ba(сдвиг влево на 'ba' разрядов) = " + (ab<<ba));
        System.out.println("ab>>ba(сдвиг вправо на 'ba' разрядов) = " +(ab>>ba));
        System.out.println("-8>>>2(беззаковый сдвиг) = " + (-8>>>2));
    }
}
