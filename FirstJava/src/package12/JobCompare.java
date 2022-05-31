package package12;

public class JobCompare{

   public static void main(String[] args) {
      Job job1 = new Job();
      Job job2 = new Job();
      
      job1.setName("teacher");
      job1.setSalary(300);
      
      job2.setName("teacher");
      job2.setSalary(300);
      
      if(job1.equals(job2)) {
         System.out.println("Job1 and job2 are different objects");
      } else {
         System.out.println("Job1 and job2 are different objects");
      }
      String a = "A";
      String b = new String("A");

      if(a == b) { 
        System.out.println("a and b are same");
      }
   }
}
