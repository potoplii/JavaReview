package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        //create a world program
        // if year is 2022->host country
        // if year is 2018->
        //if year is 2014->
        int worldCup = 2022;
        if (worldCup==2022){
            System.out.println("Host country Moldova");
        } else if (worldCup==2018) {
            System.out.println("Host country Brazil");
        } else if (worldCup==2014) {
            System.out.println("Host country Russia");
        }else {
            System.out.println("Host country Unknown");
        }
    }

}
