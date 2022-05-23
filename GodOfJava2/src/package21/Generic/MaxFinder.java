package package21.Generic;

public class MaxFinder {

   public static void main(String[] args) {
      MaxFinder max = new MaxFinder();
      max.testGetMax(); 
   }
   
   public void testGetMax() {
      System.out.println(getMax(1.4, 2.4, 3.4));
      System.out.println(getMax(3, 1, 2));
      System.out.println(getMax(2, 3, 1));
      System.out.println(getMax("a", "b", "c"));
      System.out.println(getMax("b", "c", "a"));
      System.out.println(getMax("a", "b", "c"));
   }
   
   public void testGetMin() {
      System.out.println(getMin(1, 2, 3));
      System.out.println(getMin(3, 1, 2));
      System.out.println(getMin(2, 3, 1));
      System.out.println(getMin("a", "b", "c"));
      System.out.println(getMin("b", "c", "a"));
      System.out.println(getMin("a", "b", "c"));
   }
   
   public <T extends Comparable<T>> T getMax(@SuppressWarnings("unchecked") T...a) {
      T maxT = a[0];
      for(T tempT:a) {
         System.out.println(tempT.getClass());
         if (tempT.compareTo(maxT) > 0) maxT = tempT;
      }
      return maxT;
   }
   public <T extends Comparable<T>> T getMin(@SuppressWarnings("unchecked") T...a) {
      T minT = a[0];
      for(T tempT:a) {
         System.out.println(tempT.getClass());
         if (tempT.compareTo(minT) < 0) minT = tempT;
      }
      return minT;
   }
}
