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
			buffer.get();		//���� position�� ���� ������
			printBufferStatus("get", buffer);
			buffer.mark();		//���� position�� ����
			printBufferStatus("mark", buffer);
			buffer.get();		
			printBufferStatus("get", buffer);
			buffer.reset();		//mark �ߴ� ������ ���� position�� �ű�
			printBufferStatus("reset", buffer);
			buffer.rewind();	//���� position�� 1��	
			printBufferStatus("rewind", buffer);
			buffer.clear();		//buffer�� �����, position�� 0, limit���� ������ ũ���
			printBufferStatus("clear", buffer);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
