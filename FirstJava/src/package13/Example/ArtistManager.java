package package13.Example;

public class ArtistManager {

   public static void main(String[] args) {
      ArtistManager sample = new ArtistManager();
      Singer sing = new Singer();
      Artist art = new Singer();
      Ballad ballader = new Singer();
      
      sample.greetingArtist(sing);
   }
   
   public void greetingArtist(Ballad artist) {
      System.out.println("Hello!! Ballader");
   }
   
   public void greetingArtist(Rap artist) {
      System.out.println("Hello!! Rapper");
   }
}
