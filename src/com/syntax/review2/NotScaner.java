package com.syntax.review2;

import java.util.Scanner;

public class NotScaner {
    public static void main(String[] args) {
        int i=10;
        Scanner key=new Scanner(System.in);

        System.out.println("Please enter one word");
        String word= key.next();
        System.out.println("Word that was captured = "+word);

        System.out.println("Please enter integer value");
        int num= key.nextInt();
        System.out.println("Entered number is = "+num);

        System.out.println("Please enter decimal value");
        double decimal= key.nextDouble();
        System.out.println("Decimal value = "+decimal);

        System.out.println("Today was a good day , i didn't have to use my AK");
        String line= key.nextLine();
        System.out.println(line);



    }
}
