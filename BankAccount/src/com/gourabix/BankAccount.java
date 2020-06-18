package com.gourabix;

public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void addFunds(double depositMoney) {
        this.balance += depositMoney;
        System.out.println("Amount: " + depositMoney + " INR has been added to account number: " + this.accountNumber);
        System.out.println("Updated Account Balance: " + this.balance);
    }

    public void withdrawFunds(double withdrawMoney) {
        if (this.balance < withdrawMoney) {
            System.out.println("Insufficient funds! Your current account balance is: " + this.balance);
            return;
        }

        this.balance -= withdrawMoney;
        System.out.println("Amount: " + withdrawMoney + " has been withdrawn from account number: " + this.accountNumber);
        System.out.println("Updated Account Balance: " + this.balance);
    }
}
