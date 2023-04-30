package com.syntax.review5;

public class Array2DMore {
    public static void main(String[] args) {

        int[][] numbers = new int[3][4];
        //1st row
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;
        //2nd row
        numbers[1][0] = 5;
        numbers[1][1] = 6;
        numbers[1][2] = 7;
        numbers[1][3] = 8;
        //3rd row
        numbers[2][0] = 9;
        numbers[2][1] = 10;
        numbers[2][2] = 11;
        numbers[2][3] = 12;

        System.out.println(numbers.length);//3 rows
        System.out.println(numbers[0].length);// 4 elements in 1st row
        System.out.println(numbers[1].length);//4 elements in 2nd row

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                int num = numbers[row][column];

                if (num % 3 == 0) {
                    System.out.print(num+" ");
                }
            }
        }System.out.println();
    }
}
