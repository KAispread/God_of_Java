package pacakge20;

public class JavaLangSystem {

   public static void main(String[] args) {
      JavaLangSystem sample = new JavaLangSystem();
      
      sample.printOtherBase(1024);
   }
   
   public void systemPropertiesCheck() {
      System.out.println("java.version=" + System.getProperty("java.version"));
      System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));
   }
   public void numberMinMaxElapsedCheck() {
      JavaLangNumber numberSample = new JavaLangNumber();
      long startTime = System.currentTimeMillis();
      long startNanoTime = System.nanoTime();
      numberSample.numberMinMaxCheck();
      System.out.println("Milli Second="+(System.currentTimeMillis()- startTime));
      System.out.println("Nano Second="+(System.nanoTime()- startNanoTime));
   }
   public long parseLong(String data) {
      long result = 0;
      try {
         result = Long.parseLong(data);
      } catch(NumberFormatException e) {
         System.err.println(data+" is not a number");
      } catch(Exception e) {
         System.err.println("ERROR");
      }
      return result;
   }
   public void printOtherBase(long value) {
      System.out.println("Original:"+value);
      System.out.println("Binary  :"+Long.toBinaryString(value));
      System.out.println("Hex     :"+Long.toHexString(value));
      System.out.println("Octal   :"+Long.toOctalString(value));
   }
}
