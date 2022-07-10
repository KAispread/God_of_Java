package package31.files;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class FileManager {

   public static void main(String[] args) {
      FileManager sample = new FileManager();
      String fileName = "C:\\godofjava\\AboutThisBook.txt";
      String file = "AboutThisBook.txt";
      Path fromPath = sample.writeAndRead(fileName);
      sample.copyMoveDelete(fromPath, file);
   }

   public List<String> getContents() {
      List<String> contents = new ArrayList<>();
      contents.add("이 책은 저자의 6번째 책입니다.");
      contents.add("필자의 수년간의 자바 경험을 바탕으로 집필되었습니다.");
      contents.add("많은 분들에게 도움이 되면 좋겠습니다.");
      contents.add("책에 대한 질문은 ~ 로 주시면 감사하겠습니다");
      contents.add("Current Time is .. " + new Date());
      return contents;
   }

   public Path writeFile(Path path) throws Exception {
      Charset charset = Charset.forName("EUC-KR");
      List<String> contents = getContents();
      StandardOpenOption openOption = StandardOpenOption.CREATE;
      return Files.write(path, contents, charset, openOption);
   }

   public void readFile(Path path) throws Exception {
      Charset charset = Charset.forName("EUC-KR");
      System.out.println("Path=" + path);
      List<String> fileContents = Files.readAllLines(path, charset);
      
      for (String a : fileContents) {
         System.out.println(a);
      }
      System.out.println();
   }
   
   public Path writeAndRead(String fileName) {
      Path returnPath = null;
      try {
         Path path = Paths.get(fileName);
         returnPath = writeFile(path);
         System.out.println("***** Created file contents *****");
         readFile(returnPath);
      } catch(Exception e) {
         e.printStackTrace();
      } 
      return returnPath;
   }
   
   public void copyMoveDelete(Path fromPath, String fileName) {
      try {
         Path toPath = fromPath.toAbsolutePath().getParent();
         
         // Make a Directory
         Path copyPath = toPath.resolve("copied");
         if(!Files.exists(copyPath)) {
            Files.createDirectories(copyPath);
         }
         
         // Copy Files
         Path copiedFilePath = copyPath.resolve(fileName);
         StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
         Files.copy(fromPath ,copiedFilePath, copyOption);
         
         // Read copied file
         System.out.println("******** Copied Complete ********");
         readFile(copiedFilePath);
         
         // Move file
         Path movedFilePath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"), copyOption);
         
         // Delete files
//         Files.delete(movedFilePath);
//         Files.delete(copyPath);
      } catch(Exception e ) {
         e.printStackTrace();
      }
   }
}
