package com.endava.timbuchalka.s7;

import java.util.*;

public class S7_46_Playlist {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Album> albums = new ArrayList<>();
    private static final LinkedList<Song> playlist = new LinkedList<>();
    private static final ListIterator<Song> listIterator = playlist.listIterator();
    private static Song currentSong = null;

    public static void main(String[] args) {

        boolean quit = false;
        startPlaylist();
        printActions();
        while (!quit) {
            System.out.println("Enter you choice:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shut down");
                    quit = true;
                    break;
                case 1:
                    printActions();
                    break;
                case 2:
                    printAlbum();
                    break;
                case 3:
                    printPlaylist();
                    break;
                case 4:
                    play();
                    break;
                case 5:
                    stop();
                    break;
                case 6:
                    addSong();
                    break;
                case 7:
                    moveToNext();
                    break;
                case 8:
                    moveToPrevious();
                    break;
                case 9:
                    removeSong();
                    break;
            }
        }
    }

    private static void startPlaylist() {
        System.out.println("Creating playlist ...");
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:");
        System.out.println(
                "0 - Exit\n" +
                        "1 - Print the list of available actions\n" +
                        "2 - Print album\n" +
                        "3 - Print playlist\n" +
                        "4 - Play\n" +
                        "5 - Stop\n" +
                        "6 - Add song in the playlist\n" +
                        "7 - Move to the next song\n" +
                        "8 - Move to the previous song\n" +
                        "9 - Remove an existing song");
        System.out.println("Choose your action: ");
    }

    private static void printAlbum() {
        System.out.println("Choose number of album [1-" + albums.size() + "]");
        int albumNo = scanner.nextInt();
        if (albumNo > albums.size() || albumNo < 1) {
            System.out.println("Incorrect number of album");
            return;
        }
        System.out.println(albums.get(albumNo - 1));
    }

    private static void printPlaylist() {
        System.out.println("Playlist:");
        for (int i=0; i < playlist.size(); i++) {
            System.out.println(i+1 + ". " + playlist.get(i));
        }
    }

    private static void play() {
        if (playlist.isEmpty()) {
            System.out.println("There is nothing to play");
            return;
        }
        if (currentSong == null) {
            currentSong = playlist.get(0);
        }
        System.out.println("Now is playing " + currentSong.getTitle());
    }

    private static void stop() {
        if (playlist.isEmpty() || currentSong == null) {
            System.out.println("Nothing is playing now");
            return;
        }
        System.out.println("Stop playing");
    }

    private static void addSong() {
        System.out.println("Choose number of album [1-" + albums.size() + "]");
        int albumNo = scanner.nextInt();
        if (albumNo > albums.size() || albumNo < 1) {
            System.out.println("Incorrect number of album");
            return;
        }
        System.out.println("Add a song by name (Y/N)?");
        String addByName = scanner.nextLine();
        addByName = scanner.nextLine();
        if (addByName.equalsIgnoreCase("Y")) {
            System.out.println("Enter name of song:");
            String songName = scanner.nextLine();
            if (albums.get(albumNo - 1).addToPlayList(songName, playlist)) {
                System.out.println("Song was added successfully");
            } else {
                System.out.println("Song wasn't added");
            }
        } else {
            System.out.println("Enter number of track:");
            int trackNo = scanner.nextInt();
            if (albums.get(albumNo - 1).addToPlayList(trackNo, playlist)) {
                System.out.println("Song was added successfully");
            } else {
                System.out.println("Song wasn't added");
            }
        }
    }

    private static void moveToNext() {
        if (playlist.isEmpty()) {
            System.out.println("There is nothing to play");
            return;
        }
        ListIterator<Song> listIterator = playlist.listIterator();
        if (currentSong == null || !listIterator.hasNext()) {
            currentSong = playlist.getFirst();
        } else {
            currentSong = listIterator.next();
        }
        System.out.println(currentSong.getTitle() + " is chosen");
    }

    private static void moveToPrevious() {
        if (playlist.isEmpty()) {
            System.out.println("There is nothing to play");
            return;
        }
        ListIterator<Song> listIterator = playlist.listIterator();
        if (currentSong == null || !listIterator.hasPrevious()) {
            currentSong = playlist.getLast();
        } else {
            currentSong = listIterator.previous();
        }
        System.out.println(currentSong.getTitle() + " is chosen");
    }

    private static void removeSong() {
        if (playlist.isEmpty()) {
            System.out.println("There is nothing to remove");
            return;
        }
        if (currentSong == null) {
            System.out.println("There is no song chosen");
            return;
        }
        ListIterator<Song> listIterator = playlist.listIterator();
        listIterator.remove();
    }

}

class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) != null) {
            return false;
        }
        songs.add(new Song(songTitle, duration));
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (songs.size() < trackNumber || trackNumber < 1) {
            return false;
        }
        playlist.add(songs.get(trackNumber - 1));
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song song = findSong(songTitle);
        if (song == null) {
            return false;
        }
        playlist.add(song);
        return true;
    }

    private Song findSong(String songTitle) {
        for (Song song: songs) {
            if (song.getTitle().equalsIgnoreCase(songTitle)) {
                return song;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(name + " " + artist + "\n");
        for (int i = 0; i < songs.size(); i++) {
            result.append(i+1).append(".").append(songs.get(i).toString()).append("\n");
        }
        return result.toString();
    }
}

class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}
