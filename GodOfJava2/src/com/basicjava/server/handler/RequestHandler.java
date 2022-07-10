package com.basicjava.server.handler;

import java.net.Socket;
import com.basicjava.server.manager.*;

public class RequestHandler extends Thread {
   
   private Socket socket;
   
   public RequestHandler(Socket socket) {
      this.socket = socket;
   }
   
   public void run() {
      RequestManager readManager = new RequestManager(socket);
      
      ResponseManager writeManager = new ResponseManager(socket, readManager.readRequest());
      writeManager.writeResponse();
   }
}
