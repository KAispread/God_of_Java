package package12;

public class JobCompare{

   public static void main(String[] args) {
      Job job1 = new Job();
      Job job2 = new Job();
      
      job1.setName("teacher");
      job1.setSalary(300);
      
      job2.setName("teacher");
      job2.setSalary(300);
      
      if(job1 == job2) {
         System.out.println("It is same object");
      }
   }
}
