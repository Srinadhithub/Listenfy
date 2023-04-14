package listenfy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String albumName;
    private String artist;
    private List<Song> songList;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songList=new ArrayList<>();
    }
   public  boolean findSongAlbum(String title){
        for (Song song:songList) {
            if(song.title.equals(title)){
                return true;
            }
        }
        return false;
    }
    public String addSongToAlbum(String title,double duration){
        if(findSongAlbum(title)==true){
            return "Song already exists album!";
        }
        songList.add(new Song(title, duration));
        return "Song added successfully to album!";
    }
    public  String addSongToPlaylist(int trackno,LinkedList<Song> playList){
        int index=trackno-1;
        if(index>=0 && index<songList.size()){
            Song newSong= songList.get(index);
            playList.add(newSong);
            return "added Successfully to playalist";
        }
        return "Invalid trackNo!";
    }
    public  String addSongToPlaylist(Song song,LinkedList<Song> playList){
            if(findSongPlayList(song,playList))
             {
                return "Song already exists! palylist";
            }
        playList.add(song);
        return "added Successfully to playlist";
    }
    boolean findSongPlayList(Song findsong,LinkedList<Song> playList){
        for(Song song:playList){
            if(song.title.equals(findsong.title)) return true;
        }
        return false;
    }
    String addSongToAlbum(Song song) {
        if(findSongAlbum(song)) {
            songList.add(song);
            return "song added Album";
        }
        return "somg already exitss album";
    }
    public boolean findSongAlbum(Song findsong){
        for(Song song:songList){
            if(song.title.equals(findsong.title)){
                return false;
            }
        }
        return true;
    }
}
