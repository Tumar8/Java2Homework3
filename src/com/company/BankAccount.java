package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void Deposit(double sum){
        amount = amount + sum;
        System.out.println("balance:" + amount);
    }
    public void withDraw(double sum) throws LimitException{
        System.out.println("Put your card in an ATM, please");
        if(sum > amount){
            throw new LimitException("Choose amount which you want > than your amount", amount);
        }
        amount = amount - sum;
        System.out.println("drawing" + sum);
    }
}
