package com.company;

public class arrray_1 {
    public static void main(String[] args){
        int nums[];
        int[] nums2;
        nums = new int[4];
        int[] nums3 = new int[5];
        int[] nums4 = new int[]{1,2,3,4,5};
        int[] nums5 = {1,2,3,4,20};
        int length = nums4.length;
        int last = nums5[nums5.length-1];
        System.out.printf("length = %d; last = %d\n", length, last);
        /*
        Матрица
        */
        int[][] nums6 = {{0,1,2},{3,4,5}};
        /*
        Зубчатый массив
        */
        int[][] nums7 = new int[3][];
        nums7[0] = new int[2];
        nums7[1] = new int[3];
        nums7[2] = new int[5];
        /*
        foreach
         */
        int[] array = new int[]{1,2,3,4,5};
        for (int i: array){
            System.out.println("i = " + i);
        }
        for(int i=0; i<nums6.length;i++){
            for (int j=0; j<nums6[i].length; j++){
                System.out.printf("%d ", nums6[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
