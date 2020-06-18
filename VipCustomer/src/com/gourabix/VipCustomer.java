package com.gourabix;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        // this is the default no-arg constructor
        this("Default Name", 0.00, "default@example.com");          // calls an overloaded constructor
                                                                                              // call to an overloaded constructor must be the first line.
    }

    public VipCustomer(String name, String emailAddress) {
        this(name, 5000.00, emailAddress);
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
