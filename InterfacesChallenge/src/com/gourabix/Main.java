package com.gourabix;

/*
 Create a simple interface (tip: name it Saveable or ISaveable)
 That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
 The exact type of medium is not known to the interface (nor to the classes that implement it).
 The interface will just specify two methods, one to return an ArrayList of values to be saved
 and the other to populate the object's fields from an ArrayList (parameter).

 Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
 with Players and Monsters, but you can create any type of classes that you want).

 Override the toString() method for each of your classes so that they can be easily printed to enable
 the program to be tested easier.

 In Main, write a method that takes an object that implements the interface as a parameter and
 "saves" the values e.g. calls the method defined in the interface.

 We haven't covered I/O yet, so your method should just print the values to the screen.
 Also in the Main class, write a method that restores the values to a Saveable object
 e.g. calls the method from the interface for populating fields (see above).

 Again, we are not going to use Java file I/O; instead use the readValues() method below to
 simulate getting values from a file – this allows you to type as many values as your class
 requires, and returns an ArrayList.
 There is a whole Java I/O section later in the course where you will get to use files, etc.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userChoice = -1;
        boolean validInput = false, initialCharacterSave = false, initialEnemySave = false, quit = false;
        ISaveable character = null, enemy = null;

        System.out.println("The Last of an Untitled Game Part I");
        System.out.println();

        while (!quit) {
            printMenu();

            Scanner scanner = new Scanner(System.in);
            do {
                validInput = false;
                if (scanner.hasNextInt()) {
                    userChoice = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Please, choose a correct option to continue.");
                }
                scanner.nextLine();
            } while (!validInput);

            switch (userChoice) {
                case 0:
                default:
                    System.out.println("Please, choose a correct option to continue.");
                    break;

                case 1:
                    System.out.println("You're loading a character!");
                    System.out.println("Enter the character's name and whether he/she is a 'hero' or 'villain'.");
                    List<String> characterData = readValues();
                    character = loadGameData(characterData, true);
                    System.out.println(character);
                    initialCharacterSave = true;
                    break;

                case 2:
                    System.out.println("You're loading a enemy!");
                    System.out.println("Enter the enemy's name and whether he/she is a 'hero' or 'villain'.");
                    List<String> enemyData = readValues();
                    enemy = loadGameData(enemyData, false);
                    System.out.println(enemy);
                    initialEnemySave =  true;
                    break;

                case 3:
                    System.out.println("You're saving a character!");
                    if (initialCharacterSave) {
                        List<String> characterRawData = saveGameData(character);
                        System.out.println(characterRawData);
                    } else {
                        System.out.println("Please, load a character first.");
                    }
                    break;

                case 4:
                    System.out.println("You're saving an enemy!");
                    if (initialEnemySave) {
                        List<String> enemyRawData = saveGameData(enemy);
                        System.out.println(enemyRawData);
                    } else {
                        System.out.println("Please, load an enemy first.");
                    }
                    break;

                case 5:
                    quit = true;
                    System.out.println("Thanks for playing The Last of an Untitled Game Part I!");
                    break;
            }
        }
    }


    public static List<String> readValues() {
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static List<String> saveGameData(ISaveable dataObj) {
        if (dataObj != null) {
            System.out.println("Saving data...");
            return dataObj.saveState();
        }

        return null;
    }

    public static ISaveable loadGameData(List<String> data, boolean isCharacter) {
        ISaveable saveUser;
        if (isCharacter) {
            saveUser = new Character();
        } else {
            saveUser = new Enemy();
        }
        saveUser.readState(data);
        return saveUser;
    }

    public static void printMenu() {
        System.out.println("What do you want to create?\n" +
                "Choose 1 to load a character.\n" +
                "Choose 2 to load an enemy.\n" +
                "Choose 3 to save a character.\n" +
                "Choose 4 to save an enemy.\n" +
                "Choose 5 to exit.");
    }
}
