package com.syntax.rewiew7;

public class JavaMethods {

        /*
        method of a block of code to perform specific task
        In the future we have to develop methods:
                            open/close browser
                            click on buttons
                            opening exel
                            extracting data from exel

         */
        /*
        Methods: return value
                 do not return anything

        Methods: with parameters
                 without parameters
         */

    void hello() {
        System.out.println("Hello");
    }

    void helloKitty(String name) {
        System.out.println("Hello" + name);
    }

    String concatenate(String str1,String str2,String str3){
        return str1.concat(str2).concat(str3);

    }

    int largest(int num1,int num2){
        int large;
        if (num1>num2){
            large=num1;
        }else {
            large=num2;
        }
        return large;

    }

    double convert(double celsius){
        double fahrenheit=(celsius * 9/5) + 32 ;

            return fahrenheit;
        }
    String[] createArr(String sentence) {
        return sentence.split(" ");
    }
    }

