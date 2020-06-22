package com.gourabix;

/*
 Your job is to create a simple banking application.
 There should be a Bank class
 It should have an arraylist of Branches
 Each Branch should have an arraylist of Customers
 The Customer class should have an arraylist of Doubles (transactions)
 Customer:
 Name, and the ArrayList of doubles.
 Branch:
 Need to be able to add a new customer and initial transaction amount.
 Also needs to add additional transactions for that customer/branch
 Bank:
 Add a new branch
 Add a customer to that branch with initial transaction
 Add a transaction for an existing customer for that branch
 Show a list of customers for a particular branch and optionally a list
 of their transactions
 Demonstration autoboxing and unboxing in your code
 Hint: Transactions
 Add data validation.
 e.g. check if exists, or does not exist, etc.
 Think about where you are adding the code to perform certain actions
*/

import java.util.Scanner;

public class Main {

    private static int menuChoice = -1;
    private static Scanner scanner = new Scanner(System.in);
    private static Bank infinityBank = new Bank();
    private static Branch selectedBranch = null;
    private static Customer selectedCustomer = null;

    public static void main(String[] args) {
        boolean exitApp = false, validInput = false;

        // start up menu
        initializeBank();
        displayMenu();
        userMenuPrompt();

        while (!exitApp) {
            switch (menuChoice) {
                case 0:
                    System.out.println("Hey! This is a private Easter egg!");
                    break;

                case 1:
                    System.out.println("Enter the name of the new branch: ");
                    String branchName = scanner.nextLine();
                    if (infinityBank.addNewBranch(branchName)) {
                        System.out.println("A new branch with the name: " + branchName + " was successfully created.");
                    } else {
                        System.out.println("Failed to create a new branch with the name: " + branchName);
                        System.out.println("Make sure that you're not re-using a branch name that already exists!");
                        infinityBank.displayAllBranches();
                    }
                    break;

                case 2:
                    infinityBank.displayAllBranches();
                    break;

                case 3:
                    infinityBank.displayAllBranches();
                    System.out.println("Enter the number of the branch you want to select: ");
                    int branchNumber = -1;
                    do {
                        if (scanner.hasNextInt()) {
                            branchNumber = scanner.nextInt();
                            if (branchNumber > 0 && branchNumber <= infinityBank.getBranchList().size()) {
                                validInput = true;
                            }
                        } else {
                            System.out.println("Please, enter a valid choice integer.");
                        }
                        scanner.nextLine();
                    } while (!validInput);
                    selectedBranch = getBranch(branchNumber);
                    System.out.println("You have selected branch: " + selectedBranch.getName());
                    validInput = false;
                    break;

                case 4:
                    selectedBranch.displayAllCustomers();
                    break;

                case 5:
                    selectedBranch.displayAllCustomers();
                    System.out.println("Enter the number of the customer you want to select: ");
                    int customerNumber = -1;
                    do {
                        if (scanner.hasNextInt()) {
                            customerNumber = scanner.nextInt();
                            if (customerNumber > 0 && customerNumber <= selectedBranch.getCustomerList().size()) {
                                validInput = true;
                            }
                        } else {
                            System.out.println("Please, enter a valid choice integer.");
                        }
                        scanner.nextLine();
                    } while (!validInput);
                    selectedCustomer = getCustomer(customerNumber);
                    System.out.println("You have selected customer: " + selectedCustomer.getName());
                    validInput = false;
                    break;

                case 6:
                    selectedCustomer.printCustomerInfo();
                    break;

                case 7:
                    System.out.println("Enter the amount for your transaction (must be greater than zero): ");
                    double transactionAmount = 0.0;
                    do {
                        if (scanner.hasNextDouble()) {
                            transactionAmount = scanner.nextDouble();
                            if (transactionAmount > 0) {
                                validInput = true;
                            }
                        } else {
                            System.out.println("Please, enter a valid amount.");
                        }
                        scanner.nextLine();
                    } while (!validInput);
                    boolean status = selectedCustomer.addAdditionalTransactions(transactionAmount);
                    if (status) {
                        System.out.println("New transaction worth amount: " + transactionAmount + " has been" +
                                "successfully added to customer name: " + selectedCustomer.getName());
                    } else {
                        System.out.println("Failed to add transaction worth amount: " + transactionAmount + " to" +
                                "customer name: " + selectedCustomer.getName());
                    }
                    validInput = false;
                    break;

                case 8:
                    System.out.println("Enter customer name: ");
                    String customerName;
                    do {
                        customerName = scanner.nextLine();
                        if (!customerName.isEmpty() && !customerName.matches("[0-9]")) {
                            validInput = true;
                            if (selectedBranch.addNewCustomer(customerName)) {
                                System.out.println("Created a new customer: " + customerName + " for branch: " +
                                        selectedBranch.getName());
                            } else {
                                System.out.println("Failed to create a new customer: " + customerName + " for branch: "
                                        + selectedBranch.getName());
                            }
                        } else {
                            System.out.println("Please enter a valid name for the customer.");
                        }
                    } while (!validInput);
                    break;

                case 9:
                    System.out.println("Thank you for choosing Infinity Bank!");
                    exitApp = true;
                    scanner.close();
                    break;

                default:
                    System.out.println("Please, make the correct choice.");
                    break;
            }

            if (!exitApp) {
                displayMenu();
                userMenuPrompt();
            }
        }

    }

    public static void displayMenu() {
        System.out.println("Choose from the menu options: ");
//        System.out.println("0 - Display Menu options");
        System.out.println("1 - Open a new Branch");
        System.out.println("2 - Display all branches");
        System.out.println("3 - Select a branch");
        System.out.println("4 - Display all customers for this branch");
        System.out.println("5 - Select a customer");
        System.out.println("6 - Display customer details");
        System.out.println("7 - Add a new transaction to customer");
        System.out.println("8 - Add a new customer");
        System.out.println("9 - Exit Banking App");
    }

    public static void initializeBank() {
        System.out.println("-------------------------------------------------------");
        System.out.println("            Welcome to Infinity Bank!");
        System.out.println("-------------------------------------------------------");
    }

    private static Branch getBranch(int branchNumber) {
        return infinityBank.getBranchInfo(branchNumber - 1);
    }

    private static Customer getCustomer(int customerNumber) {
        return selectedBranch.getCustomerInfo(customerNumber - 1);
    }

    public static void userMenuPrompt() {
        boolean validInput = false;
        do {
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Please, enter a valid choice integer.");
            }
            scanner.nextLine();
        } while (!validInput);

    }

}
