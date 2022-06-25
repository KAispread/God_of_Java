package package28;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {

	public static void main(String[] args) {
		SocketServerSample sample = new SocketServerSample();
		sample.startServer();
		sample.startReplyServer("OK");
	}
	
	public void startServer() {
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(9999);
			while(true) {
				System.out.println("Server: Waiting for request.");
				client = server.accept();
				System.out.println("Server: Accepted");
				InputStream stream = client.getInputStream();
				BufferedReader in = new BufferedReader(new InputStreamReader(stream));
				String data = null;
				StringBuilder receivedData = new StringBuilder();
				
				while((data=in.readLine()) != null) {
					receivedData.append(data);
				}
				
				System.out.println("Received data: " + receivedData);
				in.close();
				stream.close();
				client.close();
				
				if (receivedData != null && "EXIT".equals(receivedData.toString())) {
					System.out.println("Stop Socket Server");
					break;
				}
				System.out.println("-----------------");
			} 
		} catch(Exception e){
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
	
	public void startReplyServer(String data) {
		Socket client = null;
		try {
			Thread.sleep(1000);
			client = new Socket("127.0.0.1",9999);
			OutputStream oot = client.getOutputStream();
			BufferedOutputStream out = new BufferedOutputStream(oot);
			byte[] bytes = data.getBytes();
			out.write(bytes);
			System.out.println("Server: send data");
			out.close();
			oot.close();
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			if (client != null) {
				try {
					client.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			} 
		}
	}
}
