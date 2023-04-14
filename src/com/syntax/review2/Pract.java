package com.syntax.review2;

import java.util.Scanner;

public class Pract {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");
        String word = name.next();

        Scanner mobil1 = new Scanner(System.in);
        System.out.println("Enter your mobile number");
        String mob = mobil1.next();
        {
            char mob1 = mobil1.next().charAt(2);


            Scanner age = new Scanner(System.in);
            System.out.println("Enter your age");
            int age1 = age.nextInt();

            System.out.println("Your name is " + word + ", your age is " + age1 + " and your mobile number is " + mob1);


        }
    }
}
