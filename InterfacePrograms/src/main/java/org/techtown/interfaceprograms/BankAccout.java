package org.techtown.interfaceprograms;

public class BankAccout implements Measurable {
    private double balance;
    private int accountNumber;
    private static int lastAssingnedNumber=1000;

    public BankAccout(double balance) {
        this.balance = balance;
        lastAssingnedNumber++;
        accountNumber = LastAssignedNumber;
    }
}

    public double getMeasure() {
        return balance;
    }