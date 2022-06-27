package package28;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Date;

public class SocketClientSample {

   public static void main(String[] args) {
      SocketClientSample sample = new SocketClientSample();
      sample.sendAndReceiveSocketData();
   }

   public void sendSocketSample() {
      for (int i = 0; i < 3; i++) {
         sendSocketData("I liked java at " + new Date());
      }
      sendSocketData("EXIT");
   }

   public void sendSocketData(String data) {
      Socket socket = null;
      try {
         System.out.println("Client: Connecting");
         socket = new Socket("127.0.0.1", 9999);
         System.out.println("Client: Connect status = " + socket.isConnected());
         Thread.sleep(1000);

         OutputStream out = socket.getOutputStream();
         BufferedOutputStream bfo = new BufferedOutputStream(out);
         byte[] bytes = data.getBytes();
         bfo.write(bytes);
         System.out.println("Client: Send Data");
         bfo.close();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (socket != null) {
            try {
               socket.close();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      }
   }

   public void sendAndReceiveSocketData() {
      Socket socket = null;
      try {
         System.out.println("Client:Connecting");
         socket = new Socket("127.0.0.1", 9999); // 1)
         System.out.println("Client:Connect status=" + socket.isConnected());
         Thread.sleep(1000);
         byte[] readByte = new byte[256];
         InputStream stream = socket.getInputStream();
         BufferedInputStream in = new BufferedInputStream(stream);
         in.read(readByte);
         System.out.println("Client:received data=" + new String(readByte).trim());
         in.close();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (socket != null) {
            try {
               socket.close(); // 3)
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      }
   }

   public void startServer() {
      ServerSocket server = null;
      Socket client = null;
      try {
         server = new ServerSocket(9999);
         while (true) {
            System.out.println("Client: Waiting for request.");
            client = server.accept();
            System.out.println("Client: Accepted");

            InputStream stream = client.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(stream));

            String data = null;
            StringBuilder receivedData = new StringBuilder();

            while ((data = in.readLine()) != null) {
               receivedData.append(data);
            }

            System.out.println("Client: Received data: " + receivedData);
            in.close();
            stream.close();
            client.close();

            break;

         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if (server != null) {
            try {
               server.close();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      }
   }
}