package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        Declare 2 variables for DL and car if u have DL then will check if you have a car
         */
        boolean driveLicense = false;
        boolean car = true;
        if (driveLicense) {
            System.out.println("Let's check if u have a car");
            if (car) {
                System.out.println("You can drive to work");
            }
        } else {
            System.out.println("You should get DL");
        }
    }
}
