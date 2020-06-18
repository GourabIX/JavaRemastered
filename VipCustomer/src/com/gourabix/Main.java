package com.gourabix;

public class Main {

    public static void main(String[] args) {

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName() + " is a VIP Customer." +
                " Email ID: " + vipCustomer.getEmailAddress() +
                ". Credit Limit: " + vipCustomer.getCreditLimit() + " INR.");

        VipCustomer vipCustomer1 = new VipCustomer("Deku", "deku@uahigh.edu");
        System.out.println(vipCustomer1.getName() + " has an email address: " +
                vipCustomer1.getEmailAddress() + " and credit limit of " + vipCustomer1.getCreditLimit() + " INR.");

        VipCustomer vipCustomer2 = new VipCustomer("Izuku Midoriya", 40000.00,
                "izuku.midoriya@gmail.com");
        System.out.println(vipCustomer2.getName() + ", the greatest Hero has a credit limit of " +
                vipCustomer2.getCreditLimit() +
                " INR linked with the email address: " + vipCustomer2.getEmailAddress() + ".");
    }
}
