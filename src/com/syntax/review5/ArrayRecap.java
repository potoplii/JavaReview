package com.syntax.review5;

public class ArrayRecap {
    public static void main(String[] args) {


        String[] languages = {"English", "Romanian", "Italian", "Spanish"};

        {


            for (String langauege : languages) {
                System.out.print(langauege + " ");
            }
            System.out.println();
            for (int i = languages.length - 1; i >= 0; i--) {
                System.out.print(languages[i] + " ");

            }
        }

    }
}