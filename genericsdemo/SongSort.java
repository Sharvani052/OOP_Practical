package genericsdemo;

import java.util.*;

class Song implements Comparable<Song> {
    String title;
    String artist;
    int duration;
    public Song(String t, String a, int d) { title = t; artist = a; duration = d; }
    public int compareTo(Song s) { return title.compareTo(s.title); }
    public String toString() { return title + " - " + duration; }
}

public class SongSort {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
            new Song("Hello", "A", 200),
            new Song("World", "B", 180),
            new Song("Alpha", "C", 220)
        );
        Collections.sort(songs);
        System.out.println(songs);
        songs.sort((s1, s2) -> Integer.compare(s2.duration, s1.duration));
        System.out.println(songs);
    }
}
