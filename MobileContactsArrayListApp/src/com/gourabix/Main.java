package com.gourabix;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuChoice = -1;
        boolean inputValid = false;
        MobilePhone mobilePhone = new MobilePhone();
        boolean runAgain = true;

        displayMenu();

        while (runAgain) {

            do {
                System.out.println("Please, enter a correct integer as per your choice.");
                if (scanner.hasNextInt()) {
                    menuChoice = scanner.nextInt();
                    if (menuChoice >= 0 && menuChoice <= 6) {
                        inputValid = true;
                    }
                } else {
                    System.out.println("Please enter a correct integer");
                }
                scanner.nextLine();                             // handle enter key issue.
            } while (!inputValid);

            switch (menuChoice) {
                case 0:
                    System.out.println("Thanks for using Contacts!");
                    System.out.println();
                    scanner.close();
                    menuChoice = -1;
                    inputValid = false;
                    runAgain = false;
                    break;

                case 1:
                    System.out.println("You've selected: 'See all your contacts.'");
                    System.out.println();
                    mobilePhone.printContactsList();
                    displayMenu();
                    break;

                case 2:
                    System.out.println("You've selected: 'Add a new contact.'");
                    System.out.println();
                    System.out.println("Enter the contact's name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the contact's phone number: ");
                    String phoneNumber = scanner.nextLine();
                    boolean status = mobilePhone.addNewContact(makeContact(name, phoneNumber));
                    if (status) {
                        System.out.println(name + " saved.");
                    } else {
                        System.out.println(name + " could not be saved.");
                    }
                    displayMenu();
                    break;

                case 3:
                    System.out.println("You've selected: 'Update an existing contact.'");
                    System.out.println();
                    System.out.println("Enter the name of the contact you want to update: ");
                    String contactName = scanner.nextLine();
                    System.out.println("What do you want to update? 0 - Update contact Name / 1 - Update phone Number.");
                    int updateField = scanner.nextInt();
                    scanner.nextLine();
                    Contact oldContact = mobilePhone.queryContactName(contactName);
                    if (oldContact != null) {
                        if (updateField == 0) {
                            System.out.println("Enter a new name for the contact '" + contactName + "': ");
                            mobilePhone.updateContact(contactName, makeContact(scanner.nextLine(), oldContact.getPhoneNumber()));
                        } else if (updateField == 1) {
                            System.out.println("Enter a new phone number for the contact '" + contactName + "': ");
                            mobilePhone.updateContact(contactName, makeContact(oldContact.getName(), scanner.nextLine()));
                        } else {
                            System.out.println("Please try again with the correct choice.");
                        }
                    }
                    displayMenu();
                    break;

                case 4:
                    System.out.println("You've selected: 'Remove a contact.'");
                    System.out.println();
                    System.out.println("Enter the name of the contact you want to remove: ");
                    mobilePhone.removeContact(scanner.nextLine());
                    displayMenu();
                    break;

                case 5:
                    System.out.println("You've selected: 'Search for a contact name.'");
                    System.out.println();
                    System.out.println("Enter the name of the contact to search for: ");
                    Contact searchResult = mobilePhone.queryContactName(scanner.nextLine());
                    if (searchResult != null) {
                        System.out.println("Search Result for " + searchResult.getName() + ": ");
                        System.out.println("Contact Name: " + searchResult.getName());
                        System.out.println("Contact Phone Number: " + searchResult.getPhoneNumber());
                    }
                    displayMenu();
                    break;

                case 6:
                    System.out.println("You've selected: 'Search for a contact number.'");
                    System.out.println();
                    System.out.println("Enter the number of the contact to search for: ");
                    String searchQuery = scanner.nextLine();
                    Contact searchResult1 = mobilePhone.queryContactNumber(searchQuery);
                    if (searchResult1 != null) {
                        System.out.println("Search Result for " + searchQuery + ": ");
                        System.out.println("Contact Name: " + searchResult1.getName());
                        System.out.println("Contact Phone Number: " + searchResult1.getPhoneNumber());
                    }
                    displayMenu();
                    break;

                default:
                    displayMenu();
                    break;
            }

        }

    }

    private static Contact makeContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("                      YOUR CONTACTS                        ");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        System.out.println("Choose from the menu options: ");
        System.out.println();
        System.out.println("1: See all your contacts.");
        System.out.println("2: Add a new contact.");
        System.out.println("3: Update an existing contact.");
        System.out.println("4: Remove a contact.");
        System.out.println("5: Search for a contact name.");
        System.out.println("6: Search for a contact number.");
        System.out.println("0: Exit the contacts app.");
        System.out.println();
    }
}
