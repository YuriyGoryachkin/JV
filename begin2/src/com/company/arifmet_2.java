package com.company;

public class arifmet_2 {
    public static void main (String[] args){
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int e = 10;
        int a1 = 10;
        int b1 = 10;
        int c1 = 10;
        int d1 = 10;
        int e1 = 10;
        int a2 = 10;
        System.out.println("a = " + a);
        System.out.println("a += 10 = " + (a += 10));
        System.out.println("a -= 3 = " + (b -= 5));
        System.out.println("a *= 2 = " + (c *= 3));
        System.out.println("a <<= 4 = " + (d <<= 4));
        System.out.println("a >>= 2 = " + (e >>= 2));
        System.out.println("a /= 5 = "+(a1 /= 5));
        System.out.println("a %= 3 = "+(b1 %= 3));
        System.out.println("a &= 2 = "+(c1 &= 2));
        System.out.println("a |= 2 = "+(d1 |= 2));
        System.out.println("a ^= 2 = "+(e1 ^= 2));
        System.out.println("a >>>= 2 = "+(a2 >>>= 2));
    }
}
