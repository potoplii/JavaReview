package com.syntax.review5;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{12, -12, 67, 56},
                {45, 2, 4},
                {56, 2},
                {67, 43, 11, 13}};
       int sumOdd=0;
       int sumEven=0;
       int number;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {

                number = array[row][column];

                if (number % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
            }
        }
                System.out.println("sum even "+sumEven);
                System.out.println("sum odd "+sumOdd);
            }

        }



