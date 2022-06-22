package package27;

import java.nio.IntBuffer;

public class NioDetailSample {

	public static void main(String[] args) {
		NioDetailSample sample = new NioDetailSample();
		sample.checkBuffer();
		sample.checkBufferStatus();
	}

	public void checkBuffer() {
		try {
			IntBuffer buffer = IntBuffer.allocate(1024);
			for (int i = 0; i < 100; i++) {
				buffer.put(i);
			}
			System.out.println("Buffer Capacity = " + buffer.capacity());
			System.out.println("Buffer limit = " + buffer.limit());
			System.out.println("Buffer position = " + buffer.position());
			buffer.flip();
			System.out.println("Buffer has been fliped !!");
			System.out.println("Buffer limit = " + buffer.limit());
			System.out.println("Buffer position = " + buffer.position());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printBufferStatus(String job, IntBuffer buffer) {
		System.out.println("Buffer " + job +" !!!");
		System.out.format("Buffer position %d remaining=%d limit=%d\n", buffer.position(), buffer.remaining(), buffer.limit());
	}
	
	public void checkBufferStatus() {
		try {
			IntBuffer buffer = IntBuffer.allocate(1024);
			buffer.get();		//현재 position의 값을 가져옴
			printBufferStatus("get", buffer);
			buffer.mark();		//현재 position을 저장
			printBufferStatus("mark", buffer);
			buffer.get();		
			printBufferStatus("get", buffer);
			buffer.reset();		//mark 했던 곳으로 현재 position을 옮김
			printBufferStatus("reset", buffer);
			buffer.rewind();	//현재 position을 1로	
			printBufferStatus("rewind", buffer);
			buffer.clear();		//buffer을 지우고, position을 0, limit값을 버퍼의 크기로
			printBufferStatus("clear", buffer);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
