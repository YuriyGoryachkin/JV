package com.company;

public class modules {
    public static void main(String[] args){
        hello();
        welcome();
        sum(1, 2, 3);
        sum(1, 2, 3, 4, 5);
        System.out.println("new_sum = " + new_sum(1,2,3,4,5));
        System.out.println("new_sum = " + new_sum(1.3,2.3,3.4,4.1,5.4));
    }
    static void hello(){
        System.out.println("Hello!");
    }
    static void welcome(){
        System.out.println("Welcome!");
    }
    static void sum(int ...nums){
        int result = 0;
        for (int n: nums){
            result += n;
        }
        System.out.println("Summa = " + result);
    }
    static int new_sum(int ...nums){
        int result = 0;
        for (int n: nums){
            result += n;
        }
        return result;
    }
    static double new_sum(double ...nums){
        double result = 0;
        for (double n: nums){
            result += n;
        }
        return result;
    }
}
