package com.gourabix;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Branch() {
        this("default_branch", new ArrayList<Customer>());
    }

    public Branch(String name, ArrayList<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    // Add new customer and related behaviors

    private boolean saveCustomerToFile(Customer customer) {
        return customerList.add(customer);
    }

    public boolean addNewCustomer(Customer customer) {
        if (!customerExistsOrNot(customer.getName())) {
            return saveCustomerToFile(customer);
        }

        return false;
    }

    public boolean addNewCustomer(String customerName) {
        if (!customerExistsOrNot(customerName)) {
            return saveCustomerToFile(Customer.createNewCustomer(customerName, new ArrayList<Double>()));
        }

        return false;
    }

    private int queryCustomerPosition(String customerName) {
        for (int i = 0; i < getCustomerList().size(); i++) {
            if (customerList.get(i).getName().equalsIgnoreCase(customerName)) {
                return i;
            }
        }

        return -1;
    }

    public boolean customerExistsOrNot(String customerName) {
        if (queryCustomerPosition(customerName) >= 0) {
            return true;
        }

        return false;
    }

    public boolean customerExistsOrNot(Customer customer) {
        if (customerList.contains(customer)) {
            return true;
        }

        return false;
    }

    // Get customer info and related behaviors

    public Customer getCustomerInfo(String customerName) {
        if (customerExistsOrNot(customerName)) {
            return getCustomerList().get(queryCustomerPosition(customerName));
        }

        return null;
    }

    public void printCustomerInfo(String customerName) {
        if (customerExistsOrNot(customerName)) {
            Customer customer = getCustomerList().get(queryCustomerPosition(customerName));
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("List of transactions: ");
            for (int i = 0; i < customer.getTransactionList().size(); i++) {
                System.out.println((i + 1) + ": " + customer.getTransactionList().get(i) + " INR");
            }
        }
    }

    public void displayAllCustomers() {
        System.out.println("Here are the list of all customers linked to " + getName() + " branch: ");
        for (int i = 0; i < getCustomerList().size(); i++) {
            System.out.println((i + 1) + ". " + getCustomerList().get(i).getName());
        }
    }

    public static Branch createNewBranch(String branchName, ArrayList<Customer> customerList) {
        return new Branch(branchName, customerList);
    }

    public Customer getCustomerInfo(int position) {
        return getCustomerList().get(position);
    }
}
