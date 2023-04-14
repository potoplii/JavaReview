package com.syntax.review2;

public class AnotherNestedIf {
    public static void main(String[] args) {
        /*
        if u have a vaccine yes or not
        if dose =1
        if dose =2
        if dose =3
         */
        boolean vaccine = false;
        int dose = 8;
        if (vaccine) {
            if (dose == 1) {
                System.out.println("You need second dose");
            } else if (dose == 2) {
                System.out.println("You are fully vaccinated");
            } else if (dose == 3) {
                System.out.println("You are fully vaccinated with booster");
            }
        } else {
            System.out.println("You need a vaccine");
        }
    }
}

