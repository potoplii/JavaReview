package com.syntax.review4;

public class NestedLoop1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int a = 0; a <=9 ; a++) {


                    System.out.println(i + " " + j +" "+a);
                }
            }
        }
    }
}