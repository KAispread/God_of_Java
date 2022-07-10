package com.basicjava.server.manager;
import com.basicjava.server.dto.RequestDTO;
import java.net.Socket;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class RequestManager {
   
   private Socket socket;
   private final int BUFFER_SIZE = 2048;
   
   public RequestManager(Socket socket) {
      this.socket = socket;
   }
   
   public RequestDTO readRequest() {
      RequestDTO dto = new RequestDTO();
      try {
         InputStream request = new BufferedInputStream(socket.getInputStream());
         byte[] receivedBytes = new byte[BUFFER_SIZE];
         request.read(receivedBytes);
         String requestData = new String(receivedBytes).trim();
         String[] lines = requestData.split(System.getProperty("line.separator"));
         
         String data = lines[0];
         System.out.println("RequestDTO answered = " + data);
         String[] dataSplit = data.split(" ");

         dto.setRequestMethod(dataSplit[0]);
         dto.setUri(dataSplit[1]);
         dto.setHttpVersion(dataSplit[2]);
         
      } catch (IOException e) {
         e.printStackTrace();
      }
      return dto;
   }
}
