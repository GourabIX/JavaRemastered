package com.gourabix;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> gamesToPlay = new LinkedList<String>();

        // The default way to add items to a linked list
        /*
        gamesToPlay.add("The Last of Us Part 2");
        gamesToPlay.add("Detroit: Become Human");
        gamesToPlay.add("Quantum Break");
        gamesToPlay.add("A Plague Tale");
        gamesToPlay.add("Life is Strange 2");

        printLinkedListWhile(gamesToPlay);
        printLinkedListEnhancedFor(gamesToPlay);
        */

        addInOrder(gamesToPlay, "The Last of Us Part II");
        addInOrder(gamesToPlay, "Detroit: Become Human");
        addInOrder(gamesToPlay, "Quantum Break");
        addInOrder(gamesToPlay, "A Plague Tale");
        addInOrder(gamesToPlay, "Life is Strange 2");

        printLinkedListEnhancedFor(gamesToPlay);

        System.out.println();

        printMenu();
        browseGames(gamesToPlay);
    }

    private static void printLinkedListWhile(LinkedList<String> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printLinkedListEnhancedFor(LinkedList<String> list) {
        for (String game: list) {
            System.out.println(game);
        }
    }

    private static boolean addInOrder(LinkedList<String> gamesList, String newGame) {
        ListIterator<String> listIterator = gamesList.listIterator();

        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newGame);

            if (comparison == 0) {
                // The game already exists in the LinkedList. Do nothing.
                return false;
            } else if (comparison > 0) {
                // The game in the linked list is lexicographically greater than the game specified in the arg.
                listIterator.previous();
                listIterator.add(newGame);
                return true;
            } else if (comparison < 0) {
                // move on to the next game in the linked list
            }
        }

        listIterator.add(newGame);          // if the new game arg is to be the last game in the LL, lexicographically.
        return true;
    }

    private static void browseGames(LinkedList<String> gamesList) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<String> listIterator = gamesList.listIterator();
        boolean goingForward = true;
        boolean quitApp = false;

        while (!quitApp) {
            System.out.println("What do you want to do?");
            int userAction = scanner.nextInt();
            scanner.nextLine();

            switch (userAction) {
                case 0:
                    quitApp = true;
                    scanner.close();
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Browsing " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the Games catalogue.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Browsing " + listIterator.previous());
                    } else {
                        System.out.println("Reached the beginning of the Games catalogue.");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

                default:
                    System.out.println("You entered an invalid choice option.");
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 - to quit\n" +
                "1 - to browse the next game\n" +
                "2 - to go back to the previous game\n" +
                "3 - print the menu options\n");
    }
}
