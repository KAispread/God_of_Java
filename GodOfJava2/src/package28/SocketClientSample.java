package package28;

import java.util.Date;
import java.net.Socket;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SocketClientSample {

   public static void main(String[] args) {
      SocketClientSample sample = new SocketClientSample();
      sample.sendSocketSample();
   }
   
   public void sendSocketSample() {
      for (int i = 0; i< 3; i++) {
         sendSocketData("I liked java at " + new Date());
      }
      sendSocketData("EXIT");
   }
   
   public void sendSocketData(String data) {
      Socket socket = null;
      
      try {
         System.out.println("Client: Connecting !");
         socket = new Socket("127.0.0.1", 9999);
         System.out.println("Client: Connect status = " +socket.isConnected());
         
         OutputStream out = socket.getOutputStream();
         BufferedOutputStream bfo = new BufferedOutputStream(out);
         byte[] bytes = data.getBytes();
         bfo.write(bytes);
         
         System.out.println("Client: Sent data");
         bfo.close();
      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         if(socket != null) {
            try {
               socket.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }
   }
}
