package package12;

public class Job {
   int salary;
   String name;
   
   public void setSalary(int a) {
      this.salary = a;
   }
   public void setName(String a) {
      this.name = a;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + salary;
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!(obj instanceof Job)) {
         return false;
      }
      Job other = (Job) obj;
      if (name == null) {
         if (other.name != null) {
            return false;
         }
      } else if (!name.equals(other.name)) {
         return false;
      }
      if (salary != other.salary) {
         return false;
      }
      return true;
   }
}
