package com.syntax.review4;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("Arry");
        System.out.println();
     String[] planets={"earth","mars","jupiter","saturn","neptune"};
     /*   System.out.println(planets[0]);
        System.out.println(planets[1]);
        System.out.println(planets[2]);
        System.out.println(planets[3]);
        */
        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i]);
        }
        System.out.println();
        System.out.println("Enhanced for Loop");
        System.out.println();
        for (String planet :planets){
            System.out.println(planet);
        }
    }
}
