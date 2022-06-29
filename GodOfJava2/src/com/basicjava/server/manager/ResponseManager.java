package com.basicjava.server.manager;
import com.basicjava.server.dto.RequestDTO;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

public class ResponseManager {
   
   private Socket socket;
   private RequestDTO dto;
   
   public ResponseManager(Socket socket, RequestDTO dto) {
      this.socket = socket;
      this.dto = dto;
   }
   
   public void writeResponse() {
      PrintStream response;
      
      try {
         response = new PrintStream(socket.getOutputStream());
         response.println("HTTP/1.1 200 OK");
         response.println("Content-type: text/html");
         response.println();
         response.print(checkUri());
         response.flush();
         response.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   public String checkUri() {
      String uri = dto.getUri();
      switch(uri) {
      case("/"):
         return "It is working";
         
      case("/today"):
         return new Date().toString();
      default:
         break;
      }
      
      return "None";
   }
   
}
