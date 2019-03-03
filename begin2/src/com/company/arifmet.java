package com.company;

public class arifmet {
    public static void main (String[] args){
        float ostatok = 22 % 4;
        int a0 = 10;
        int a1 = 10;
        int a2 = 10;
        int a3 = 10;
        int a4 = 10;
        int b = ++a1;
        int c = a2++;
        int d = --a3;
        int e = a4--;
        System.out.println("ostatok(22%4) = " + ostatok);
        System.out.printf("a = %d; b(++a) = %d; c(a++) = %d; d(--a) = %d; e(a--) = %d", a0, b, c, d, e);
    }
}
