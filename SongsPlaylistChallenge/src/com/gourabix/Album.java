package com.gourabix;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String title;
    private String artist;
    private ArrayList<Song> songsList;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songsList = new ArrayList<Song>();
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    public boolean addSongToAlbum(Song song) {
        if (!doesSongExistInAlbum(song.getTitle())) {
            return songsList.add(song);
        }

        return false;
    }

    public boolean addSongToAlbum(String title, double duration) {
        Song song = new Song(title, duration);
        if (!doesSongExistInAlbum(title)) {
            return songsList.add(song);
        }

        return false;
    }

    public boolean addSongToPlaylist(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null && !doesSongExistInPlaylist(song, playlist)) {
            return playlist.add(song);
        }

        System.out.println("Couldn't add song: " + title + " to the playlist.");
        return false;
    }

    public boolean addSongToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        Song song = findSong(trackNumber);
        if (song != null && !doesSongExistInPlaylist(song, playlist)) {
            return playlist.add(song);
        }

        System.out.println("Couldn't add song track: " + trackNumber + " to the playlist.");
        return false;
    }

    private boolean doesSongExistInPlaylist(Song song, LinkedList<Song> playlist) {
        if (playlist.contains(song)) {
            return true;
        }

        return false;
    }

    private boolean doesSongExistInAlbum(String title) {
        if (songsList.isEmpty()) {
            return false;
        }

        for (Song song: songsList) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }

        return false;
    }

    private int findSongPositionInAlbum(String title) {
        if (songsList.isEmpty()) {
            return -1;
        }

        int i = 0;
        for (Song song: songsList) {
            i++;
            if (song.getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }

        return -1;
    }

    private Song findSong(String title) {
        if (songsList.isEmpty()) {
            return null;
        }

        for (Song song: songsList) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }

        return null;
    }

    private Song findSong(int trackNumber) {
        if ((trackNumber > 0) && (trackNumber - 1 < songsList.size())) {
            return songsList.get(trackNumber - 1);
        }

        return null;
    }
}
