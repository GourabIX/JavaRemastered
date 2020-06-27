package com.gourabix;

/*
 Create a program that implements a playlist for songs
 Create a Song class having Title and Duration for a song.
 The program will have an Album class containing a list of songs.
 The albums will be stored in an ArrayList
 Songs from different albums can be added to the playlist and will appear in the list in the order
 they are added.
 Once the songs have been added to the playlist, create a menu of options to:-
 Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
 List the songs in the playlist
 A song must exist in an album before it can be added to the playlist (so you can only play songs that
 you own).
 Hint:  To replay a song, consider what happened when we went back and forth from a city before we
 started tracking the direction we were going.
 As an optional extra, provide an option to remove the current song from the playlist
 (hint: listiterator.remove()
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albumsList = new ArrayList<Album>();
        LinkedList<Song> playlist = new LinkedList<Song>();

        Album album = new Album("The Dark Knight", "Hans Zimmer, James Newton Howard");
        album.addSongToAlbum("Why so serious?", 4.25);
        album.addSongToAlbum("I am the Batman", 3.43);
        album.addSongToAlbum("Watch the World burn", 7.46);
        album.addSongToAlbum("I am not a hero", 7.24);
        album.addSongToAlbum("The Dark Knight", 5.41);
        albumsList.add(album);

        album = new Album("Batman v Superman: Dawn of Justice", "Hans Zimmer, Junkie XL");
        album.addSongToAlbum("The Red Capes are coming", 4.24);
        album.addSongToAlbum("Man of Steel", 3.21);
        album.addSongToAlbum(new Song("What are you going to do when you're not saving the World?", 3.46));
        album.addSongToAlbum("Wonder Woman theme", 2.47);
        album.addSongToAlbum("Beautiful lies", 4.12);
        albumsList.add(album);

        albumsList.get(0).addSongToPlaylist("Man of Steel", playlist);      // not found.
        albumsList.get(0).addSongToPlaylist("The Dark Knight", playlist);
        albumsList.get(0).addSongToPlaylist(2, playlist);
        albumsList.get(0).addSongToPlaylist("Watch the world burn", playlist);      // case insensitive
        albumsList.get(1).addSongToPlaylist(2, playlist);
        albumsList.get(1).addSongToPlaylist(3, playlist);
        albumsList.get(1).addSongToPlaylist("wonder woman theme", playlist);
        albumsList.get(1).addSongToPlaylist("What are you going to sacrifice?", playlist);       // not found
        albumsList.get(0).addSongToPlaylist("What are you going to sacrifice?", playlist);       // not found
        albumsList.get(1).addSongToPlaylist(5, playlist);

        controlPlaylist(playlist);

    }

    private static void printList(LinkedList<Song> playlist) {
        System.out.println("---------------- PLAYLIST ------------------");
        for (Song song: playlist) {
            System.out.println(song);
        }
        System.out.println("---------------- PLAYLIST ------------------");
    }

    private static void printMenu() {
        System.out.println("Select what you want to do: ");
        System.out.println("0 - to exit media player\n" +
                "1 - list all songs in the playlist\n" +
                "2 - Skip to the next song\n" +
                "3 - Go back to the previous song\n" +
                "4 - Replay the present song\n" +
                "5 - Remove the current song from the playlist");
    }

    private static void controlPlaylist(LinkedList<Song> playlist) {
        int userAction = 0;
        boolean quitPlayer = false;
        boolean goingForward = true;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playlist.listIterator();
        printMenu();

        while (!quitPlayer) {
            System.out.println("What do you want to do?");
            System.out.println();
            userAction = scanner.nextInt();
            scanner.nextLine();

            switch (userAction) {
                case 0:
                    quitPlayer = true;
                    scanner.close();
                    break;

                case 1:
                    printList(playlist);
                    break;

                case 2:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }

                        goingForward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist.");
                        goingForward = false;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }

                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous());
                    } else {
                        System.out.println("Reached the beginning of the playlist.");
                        goingForward = true;
                    }
                    break;

                case 4:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying: " + listIterator.previous());
                            goingForward = false;
                        } else {
                            System.out.println("Currently at the beginning of the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying: " + listIterator.next());
                            goingForward = true;
                        } else {
                            System.out.println("Currently at the end of the playlist.");
                        }
                    }
                    break;

                case 5:
                    if (playlist.size() > 0) {
                        boolean emptyPlaylist = true;
                        listIterator.remove();      // call can be made once per call to next() or previous().

                        if (listIterator.hasNext()) {
                            System.out.println("Song removed. Now playing: " + listIterator.next());
                            emptyPlaylist = false;
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Song removed. Now playing: " + listIterator.previous());
                            emptyPlaylist = false;
                        }

                        if (emptyPlaylist) {
                            System.out.println("Song removed. Playlist is empty. Add some music to get rockin'!");
                        }
                    }
                    break;

                default:
                    System.out.println("Please, choose a correct option.");
                    printMenu();
                    break;
            }
        }
    }
}
