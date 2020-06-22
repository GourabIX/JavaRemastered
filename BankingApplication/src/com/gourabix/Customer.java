package com.gourabix;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactionList;

    public Customer(String name) {
        this.name = name;
        this.transactionList = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", transactionList=" + transactionList +
                '}';
    }

    public void printCustomerInfo() {
        System.out.println("Customer Name: " + getName());
        System.out.println("List of transactions: ");
        for (int i = 0; i < getTransactionList().size(); i++) {
            System.out.println((i + 1) + ": " + getTransactionList().get(i) + " INR");
        }
    }

    // Add additional transactions for a customer and related behaviors
    public boolean addAdditionalTransactions(double transactionAmount) {
        return getTransactionList().add(transactionAmount);
                                    // same as ...add(Double.valueOf(transactionAmount))
    }

}
