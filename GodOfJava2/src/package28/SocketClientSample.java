package package28;

import java.net.Socket;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Date;

public class SocketClientSample {

	public static void main(String[] args) {
		SocketClientSample sample = new SocketClientSample();
		sample.sendSocketSample();
		sample.sendAndReceiveSocketData("ha");
	}
	
	public void sendSocketSample() {
		for(int i = 0; i < 3; i++) {
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
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void sendAndReceiveSocketData(String data) {
		Socket socket = null;
		try {
			System.out.println("Client: Connecting");
			socket = new Socket("127.0.0.1", 9999);
			System.out.println("Client: Connect status = " + socket.isConnected());
			Thread.sleep(1000);
			InputStream inp = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inp));
			
			StringBuilder receivedData = new StringBuilder();
			String rData = null;
			while ((rData = reader.readLine()) != null) {
				receivedData.append(data);
			}
			System.out.println("Client: Received data = " + receivedData);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
