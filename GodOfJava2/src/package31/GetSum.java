package package31;

import java.util.concurrent.RecursiveTask;

public class GetSum extends RecursiveTask<Long>{
   long from, to;
   
   public GetSum(long from, long to) {
      this.from = from;
      this.to = to;
   }
   
   public Long compute() {
      long gap = to - from;
      
      if (gap<=3) {
         long tempSum = 0;
         
         for(long i = from; i <= to; i++) {
            tempSum += i;
         }
         return tempSum;
      } else {
         long middle = (to + from) / 2;
         
         GetSum setMiddle = new GetSum(from, middle);
         setMiddle.fork();
         GetSum setEnd = new GetSum((middle+1), to);
         return setEnd.compute() + setMiddle.join();
      }
      
   }
}
