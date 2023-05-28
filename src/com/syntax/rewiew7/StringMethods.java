package com.syntax.rewiew7;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";
        String str1="Hello";

        String str2=new String("Hello");
        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        str=str.toUpperCase();
        System.out.println(str);
        StringBuilder sb=new StringBuilder("Hello"); //String builder is mutable
        sb.reverse();
        System.out.println(sb);
        sb.append("Hello");
        str=sb.toString();
        System.out.println(str);

        String given="Class";
        StringBuilder strb=new StringBuilder(given);
        strb.reverse().toString();
    }
}
