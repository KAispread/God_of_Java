package package26;

import java.io.File;

public class FileFilterSample {

   public static void main(String[] args) {
      FileFilterSample sample = new FileFilterSample();
      String pathName = File.separator + "godofjava" + File.separator + "text";
      sample.checkList(pathName);
   }

   public void checkList(String pathName) {
      File file;

      try {
         file = new File(pathName);
         
         File [] mainFilenameList = file.listFiles(new JPGFilenameFilter());
         
         for (File fileList : mainFilenameList) {
            System.out.println("File name = " + fileList.getName());
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
