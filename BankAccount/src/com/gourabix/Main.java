package com.gourabix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Infinity Bank!");

        System.out.println("Enter your name: ");
        bankAccount.setCustomerName(scanner.nextLine());

        System.out.println("Enter bank account number for customer: ");
        bankAccount.setAccountNumber(scanner.nextLong());
        scanner.nextLine();         // handle enter key issue

        System.out.println("Enter your phone number: ");
        bankAccount.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter your email address: ");
        bankAccount.setEmail(scanner.nextLine());

        System.out.println("Enter initial bank balance: ");
        bankAccount.setBalance(scanner.nextDouble());
        scanner.nextLine();

        System.out.println(bankAccount.getCustomerName() + " (" + bankAccount.getEmail() + " - " +
                bankAccount.getPhoneNumber() + ") has successfully created an account with number: "
                + bankAccount.getAccountNumber() + " which has a balance of " + bankAccount.getBalance() + ".");

        int depositFunds = 0;

        while (true) {
            System.out.println("Do you want to add funds or withdraw money? (0 - withdraw, 1 - add money)");
            if (scanner.hasNextInt()) {
                depositFunds = scanner.nextInt();
                switch (depositFunds) {
                    case 0:
                        System.out.println("Your current balance is: " + bankAccount.getBalance());
                        System.out.println("Enter the amount you want to withdraw from your bank account: ");
                        if (scanner.hasNextDouble()) {
                            bankAccount.withdrawFunds(scanner.nextDouble());
                        }
                        break;

                    case 1:
                        System.out.println("Your current balance is: " + bankAccount.getBalance());
                        System.out.println("Enter the amount that you want to add to your bank balance: ");
                        if (scanner.hasNextDouble()) {
                            bankAccount.addFunds(scanner.nextDouble());
                        }
                        break;

                    default:
                        System.out.println("You have selected an invalid option. Please, try again.");
                        break;
                }
            } else {
                System.out.println("Thanks for transacting with Infinity Bank! Have a nice day.");
                break;
            }
        }

    }
}
