package package21;

public class GenericSample {

   public static void main(String[] args) {
      GenericSample sample = new GenericSample();
      sample.checkGenericDTO();
   }
   public void checkGenericDTO() {
      CastGenericDTO<String> dto1 = new CastGenericDTO<String>();
      dto1.setObject(new String());
      CastGenericDTO<StringBuffer> dto2 = new CastGenericDTO<StringBuffer>();
      dto2.setObject(new StringBuffer());
      CastGenericDTO<StringBuilder> dto3 = new CastGenericDTO<StringBuilder>();
      dto3.setObject(new StringBuilder());
   }

}
