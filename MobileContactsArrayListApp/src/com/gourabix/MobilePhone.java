package com.gourabix;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> phoneContacts = new ArrayList<Contact>();

    public boolean addNewContact(Contact contact) {
        int duplicateContactPosCheck = queryContactPosition(contact.getName());
        if (duplicateContactPosCheck == -1) {
            boolean status = phoneContacts.add(contact);
            System.out.println(contact.getName() + " has been successfully added to the contacts list!");
            return status;
        } else {
            System.out.println("A contact with the name: " + contact.getName() + " already exists!");
            System.out.println("Details of the existing contact are as follows: ");
            Contact duplicate = getContactAtPosition(duplicateContactPosCheck);
            System.out.println("Name: " + duplicate.getName() + " \t Phone Number: " + duplicate.getPhoneNumber());
            return false;
        }
    }

    private ArrayList<Contact> getPhoneContacts() {
        return phoneContacts;
    }

    public void printContactsList() {
        System.out.println("Here's the list of your saved contacts: ");

        ArrayList<Contact> savedContacts = getPhoneContacts();
        System.out.println("Total Contact count: " + savedContacts.size() + ".");
        for (int i = 0; i < savedContacts.size(); i++) {
            System.out.println("Name: " + savedContacts.get(i).getName() + "\t Phone Number: " +
                    savedContacts.get(i).getPhoneNumber());
        }

        System.out.println();
    }

    public Contact queryContactName(String contactName) {
        ArrayList<Contact> allContacts = getPhoneContacts();
        for (int i = 0; i < allContacts.size(); i++) {
            if (allContacts.get(i).getName().equalsIgnoreCase(contactName)) {
                return allContacts.get(i);
            }
        }

        System.out.println("No contact with the name: " + contactName + " was found!");
        return null;
    }

    public Contact queryContactNumber(String contactNumber) {
        ArrayList<Contact> allContacts = getPhoneContacts();
        for (int i = 0; i < allContacts.size(); i++) {
            if (allContacts.get(i).getPhoneNumber().equals(contactNumber)) {
                return allContacts.get(i);
            }
        }

        System.out.println("No contact with the phone number: " + contactNumber + " was found!");
        return null;
    }

    private int queryContactPosition(String contactName) {
        ArrayList<Contact> allContacts = getPhoneContacts();
        for (int i = 0; i < allContacts.size(); i++) {
            if (allContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }

        System.out.println("No contact with the name: " + contactName + " was found!");
        return -1;
    }

    private Contact getContactAtPosition(int position) {
        if (position >= 0 && position < phoneContacts.size()) {
            return phoneContacts.get(position);
        } else {
            return null;
        }
    }

    public void updateContact(String contactName, Contact newContact) {
        int contactPosition = queryContactPosition(contactName);
        Contact prevContact = new Contact();
        boolean status = false;

        if (contactPosition != -1) {
            prevContact = phoneContacts.set(contactPosition, newContact);
            status = true;
        }

        if (status) {
            System.out.println(prevContact.getName() + " was updated successfully.");
        } else {
            System.out.println("Couldn't update " + contactName + "!");
            if (contactPosition == -1) {
                System.out.println("Reason: No such contact with name: " + contactName + " was found!");
            } else {
                System.out.println("Something went wrong! Sorry about that.");
            }
        }
    }

    public boolean removeContact(String contactName) {
        Contact contactToRemove = queryContactName(contactName);
        boolean status = false;

        if (contactToRemove != null) {
            status = phoneContacts.remove(contactToRemove);
            if (status) {
                System.out.println("Contact Name: " + contactName + " has been removed successfully.");
            } else {
                System.out.println("Something went wrong. Contact name: " + contactName + " could not be removed.");
            }
        } else {
            System.out.println("No such contact with name: " + contactName + " found!");
        }

        return status;
    }

}
