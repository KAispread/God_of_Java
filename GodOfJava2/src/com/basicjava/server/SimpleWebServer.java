package com.basicjava.server;

import java.net.ServerSocket;
import java.net.Socket;
import com.basicjava.server.handler.RequestHandler;

public class SimpleWebServer {
   
   final int PORT = 9999;
   
   public static void main(String[] args) {
      SimpleWebServer sampleServer = new SimpleWebServer();
      sampleServer.run();
   }
   
   public void run() {
      ServerSocket server = null;
      Socket client = null;
      try {
         server = new ServerSocket(PORT);
         while (true) {
            System.out.println("Server: Wating for connecting..");
            client = server.accept();
            System.out.println("Server: Connected");
            
            RequestHandler handler = new RequestHandler(client);
            handler.start();
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (server != null) {
            try {
               server.close();
            } catch(Exception e) {
               e.printStackTrace();
            }
         }
      }
   }
}
