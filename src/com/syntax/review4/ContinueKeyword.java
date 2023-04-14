package com.syntax.review4;

public class ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {

            if (i==3){
                continue; // skips 3 bc of condition i==3
            }

            System.out.print(i);
            System.out.print(" hi");
            System.out.print(" bye ");

        }
    }
}
