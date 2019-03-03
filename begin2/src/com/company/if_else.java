package com.company;

public class if_else {
    public  static void main(String[] args){
        int num1 = 6;
        int num2 = 4;
        int num3 = 8;
        if (num1>num2){
            System.out.println("num1 > num2");
        }
        else if (num1<num2){
            System.out.println("num1 < num2");
        }
        else{
            System.out.println("nim1 = num2");
        }
        switch (num3){
            case 1:
                System.out.println("num3 = 1");
                break;
            case 8:
                System.out.println("num3 = 8");
                num3++;
            case 9:
                System.out.println("num3 = 9");
                break;
            default:
                System.out.println("num3 = " + num3);
        }
        int x = 3;
        int y = 2;
        int z = x<y? (x+y):(x-y);
        System.out.println("z = " + z);
    }

}
