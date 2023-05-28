package com.syntax.review7;

public class JavaMethodsTester {
    public static void main(String[] args) {
        JavaMethods jm=new JavaMethods();
        jm.hello();
        jm.helloKitty("Jimmy");
        double temp=jm.convert(40);
        System.out.println(temp);

        String[] arr=jm.createArr("Today is May 4");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.print(s+" ");

        }



    }

}