package package26;

import java.io.File;
import java.util.Date;
import java.io.IOException;

public class FileSample {

   public static void main(String[] args) {
      FileSample sample = new FileSample();
      
      
      String pathName = "C:" + File.separator + "godofjava"+ File.separator + "text";
      String path = "C:\\godofjava\\text.txt";
      String fileName = "test.txt";
      
      sample.createFile(pathName, fileName);
   }

   public void checkPath(String pathName) {
      File file = new File(pathName);
      System.out.println(pathName + " is exist? = " + file.exists());
   }

   public void mkDir(String pathName) {
      File file = new File(pathName);
      System.out.println("Make " + pathName + " result = " + file.mkdirs());
   }

   public void checkFileMethods(String pathName) {
      File file = new File(pathName);
      System.out.println(pathName + "is directory? = " + file.isDirectory());
      System.out.println(pathName + "is file? = " + file.isFile());
      System.out.println(pathName + "is hidden? = " + file.isHidden());
   }
   
   public void canFileMethods(String pathName) {
      File file = new File(pathName);
      System.out.println(pathName + "is can read? = " + file.canRead());
      System.out.println(pathName + "is can write? = " + file.canWrite());
      System.out.println(pathName + "is can excute? = " + file.canExecute());
   }

   public void lastModified(String pathName) {
      File file = new File(pathName);
      System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
   }

   public void deleteFile(String pathName) {
      File file = new File(pathName);
      System.out.println(pathName + " is delete = " + file.delete());
   }
   
   public void createFile(String pathName, String fileName) {
      File file = new File(pathName, fileName);
      try {
         System.out.println("Create file = " + file.createNewFile());
         getFileInfo(file);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   public void getFileInfo(File file) throws IOException {
      System.out.println("Absolute path = " +file.getAbsolutePath());
      System.out.println("Absolute file = " +file.getAbsoluteFile());
      System.out.println("Canonical path = " +file.getCanonicalPath());
      System.out.println("Canonical file = " +file.getCanonicalFile());
      
      System.out.println("Name = " + file.getName());
      System.out.println("Path = " + file.getPath());
      System.out.println("Parente = " + file.getParent());
   }
}
