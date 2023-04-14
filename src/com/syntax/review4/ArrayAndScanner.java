package com.syntax.review4;

import java.util.Scanner;

public class ArrayAndScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many integers you want to store");
        int size= scanner.nextInt();
        int[] numbers=new int[size];
        for (int i = 0; i < numbers.length ; i++) {
            //for (int i = 0; i < size ; i++)
            System.out.println("please enter "+(i+1)+" element");
            numbers[i]= scanner.nextInt();
        }

    }
}
