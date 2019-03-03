package com.company;

public class boolean_and_logic {
    public static void main (String[] args){
        int a = 10;
        int b = 4;
        System.out.printf("a = %d; b = %d\n", a, b);
        System.out.println("a==b = " + (a==b));
        System.out.println("a==10 = " + (a==10));
        System.out.println("a!=b = " + (a!=b));
        System.out.println("a!=10 = " + (a!=10));
        System.out.println("a<b = " + (a<b));
        System.out.println("a>b = " + (a>b));
        System.out.println("a>=b = " + (a>=b));
        System.out.println("a>=20 = " + (a>=20));
        System.out.println("a<=b = " + (a<=b));
        System.out.println("a<=20 = " + (a<=20));
        boolean c = true;
        boolean d = false;
        System.out.println("true|false = " + (c|d));
        System.out.println("true|true = " + (c|true));
        System.out.println("false|false = " + (false|d));
        System.out.println("true&false = " + (c&d));
        System.out.println("true&true = " + (c&true));
        System.out.println("false&false = " + (false|d));
        System.out.println("!false = " + (!d));
        System.out.println("!true = " + (!true));
        System.out.println("true^false = " + (c^d));
        System.out.println("true^true = " + (c^true));
        System.out.println("false^false = " + (false^d));
        System.out.println("true||false = " + (c||d));
        System.out.println("true||true = " + (c||true));
        System.out.println("false||false = " + (false||d));
        System.out.println("true&&false = " + (c&&d));
        System.out.println("true&&true = " + (c&&true));
        System.out.println("false&&false = " + (false&&d));
    }
}
