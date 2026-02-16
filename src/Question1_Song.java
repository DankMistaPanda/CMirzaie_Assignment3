/*
1 (code) [7 points] Create a Song class that represents a song in spotify. The class should have the
following member data attributes: title(string), artist(string), and length(double).

Example instance would have the following values:
title: El Pibe De Mi Barrio
artist: Dr. Krapula
length: 2.47
 */
public class Question1_Song {
    String title, artist;
    double length;

    //Constructor
    public Question1_Song(String songTitle, String songArtist, double songLength){
        this.title = songTitle;
        this.artist = songArtist;
        this.length = songLength;
    }

    //Mutators
    public String getTitle() {
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public double getLength() {
        return length;
    }

    //Accessors
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setLength(double length) {
        this.length = length;
    }

    //ToString
    @Override
    public String toString() {
        return "Title: " + title +
                "\nArtist: " + artist +
                "\nLength: " + length;
    }
}
