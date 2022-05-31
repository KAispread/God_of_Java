package package13.Example;


public class Singer extends Artist implements Ballad, Practice{
   @Override
   public String singingType() {
      return "Ballad";
   }
   @Override
   public void drinkWater() {
      System.out.println("He is drinking water");
   }
   @Override
   public void getMember() {
      System.out.println("Getting member");
   }
   @Override
   public void reservationStudio() {
      System.out.println("Studio reservation is complete");
   }
}
