package package21;

public class CastGenericDTO<T> {
   private T object;
   public void setObject(T obj) {
      this.object = obj;
   }
   public T getObject(){
      return object;
   }
}
