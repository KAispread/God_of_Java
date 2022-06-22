package package27;

import static java.io.File.separator;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ManageObject {

	public static void main(String[] args) {
		ManageObject manager = new ManageObject();
		String fullPath = separator + "godofjava" + separator + "text" + separator + "serial.obj";
		SerialDTO dto = new SerialDTO("GodOfJavaBook", 1, true, 100);
		
//		manager.saveObject(fullPath, dto);
		manager.readObject(fullPath);
	}
	
	public void saveObject(String fullPath, SerialDTO dto) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fullPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(dto);
			System.out.println("Write Success!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void readObject(String fullPath) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fullPath);
			ois = new ObjectInputStream(fis);
			
			SerialDTO dto = (SerialDTO)ois.readObject();
			System.out.println("Read Success!!");
			System.out.println(dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
