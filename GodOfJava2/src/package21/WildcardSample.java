package package21;

public class WildcardSample {

   public static void main(String[] args) {
      WildcardSample sample = new WildcardSample();
      sample.callWildcardMethod();
   }
   public void callWildcardMethod() {
      WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
      wildcard.setWildcard("A");
      System.out.println(wildcardStringMethod(wildcard));
   }
   public String wildcardStringMethod(WildcardGeneric<?> c) {
      return  (String)c.getWildcard();
   }
}
