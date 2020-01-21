package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount KICBBank = new BankAccount();
        {
            KICBBank.Deposit(10000);
            while (true) {
                try {
                    if (KICBBank.getAmount() > 1300) {
                        KICBBank.withDraw(600);
                        System.out.println("With drawing 600");
                    } else {
                        KICBBank.withDraw(600);
                        System.out.println("Remaining balance is less than 700");
                    }
                } catch (Exception e) {
                    e.getMessage();
                    break;
                }
            }
        }
    }
}


