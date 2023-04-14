package listenfy;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.security.PublicKey;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;

// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner s= new Scanner(System.in);
        Song song1=new Song("robo",3.42);
        Song song2=new Song("petta",5.09);
        Song song3=new Song("mass",3.05);
        Song song4=new Song("yemito",3.00);
        Song song5=new Song("cheliya",3.20);
        Song song6=new Song("manohari",4.07);
        Album album1= new Album("Rajini","Anirudh");
        Album album2= new Album("HITS","Ilayaraja");
       album1.addSongToAlbum(song1);
       album1.addSongToAlbum(song4);
        album1.addSongToAlbum(song5);
        album1.addSongToAlbum("Love",4.53);
        album2.addSongToAlbum(song2);
        album2.addSongToAlbum(song3);
       album2.addSongToAlbum(song3);
        album2.findSongAlbum(song1.getTitle());
        LinkedList<Song> PlayList= new LinkedList<>();
        System.out.println(album2.addSongToPlaylist(song1,PlayList));
        System.out.println(album1.addSongToPlaylist(5,PlayList));
        System.out.println(album1.addSongToPlaylist(3,PlayList));
        album2.addSongToPlaylist(song3,PlayList);
        album2.addSongToPlaylist(song3,PlayList);
        album2.addSongToPlaylist(song2,PlayList);
        System.out.println(PlayList.toString());
       boolean quit=true;
        ListIterator<Song> lt=PlayList.listIterator();
        boolean fr=true;
          while(quit=true){

              int c=s.nextInt();

              switch (c){
                  case 0: quit=false;
                  case 1: if(fr==false){
                      if(lt.hasNext())
                      lt.next();
                      else System.out.println("End of the queue");
                  }
                      if(lt.hasNext()){
                          System.out.println("curent song"+lt.next().toString());
                          fr=true;}
                      else System.out.println("End of the queue");
                      break;
                  case 2: if(fr==true){
                      if(lt.hasPrevious())
                      lt.previous();
                      else System.out.println("already you are first song");
                  }  if(lt.hasPrevious()){
                      System.out.println("curent song"+lt.previous().toString());
                      fr=false;}
                    else System.out.println("already you are first song");
                      break;

                  case 3: if(PlayList.size()==0) System.out.println("empty palylist");
                  else if (fr==true) {
                      System.out.println("removed"+lt.previous());
                      lt.remove();
                      fr=false;
                  }
                  else{
                      System.out.println("removed"+lt.next());
                      lt.remove();
                      fr=true;
                  }
                      break;
                  case 4:
                      System.out.println(PlayList.toString());
                      menu();
                      break;
              }
          }

    }
    static void menu(){
        System.out.println("0-quit "+"\n"+"1-next"+"2-previous"+"3-delte"+"4-menu");
    }

}