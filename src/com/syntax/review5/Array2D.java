package com.syntax.review5;

public class Array2D {
    public static void main(String[] args) {

        String[][] cars={{"Chevy","Ford","Dodge"},
                {"BMW","Audi","VW","Mercedes"},
                {"Honda","Toyota","Subaru","Nissan"}};
        System.out.println(cars[1][1]);

        for (String [] garage:cars) {



            for (String car:garage){

                System.out.print(car+" ");
            }
            System.out.println();
        }
    }

}
