package com.syntax.review7;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount bank=new BankAccount();
        bank.accountHoldeer="Jhone Smith";
        bank.accountNumber=46323525345L;
        bank.accountBalane=20.2;
        bank.ssn=343454365;

        BankAccount bank1=new BankAccount();
        bank1.accountHoldeer="Patric Smith";
        bank1.accountNumber=4667567785345L;
        bank1.accountBalane=21.2;
        bank1.ssn=10098365;


        System.out.println("===============before================");
        System.out.println(BankAccount.bankName);
        bank1.bankName="Chase";


        System.out.println("=================after===============");
        System.out.println(BankAccount.bankName);

    }
}

