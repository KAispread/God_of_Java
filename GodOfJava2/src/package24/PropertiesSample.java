package package24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {

	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.saveAndLoadProperties();
	}
	public void checkProperties() {
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();
		for (Object temp:keySet) {
			System.out.println(temp+"="+prop.get(temp));
		}
	}
	public void saveAndLoadProperties() {
		try {
			String fileName = "test.xml"; 
			File propertiesFile = new File(fileName);
			// test.properties라는 파일명으로 저장
			FileOutputStream fos = new FileOutputStream(propertiesFile);
			Properties prop = new Properties();
			prop.setProperty("Writer", "Sangmin, Lee");
			prop.setProperty("WriterHome", "http://www.GodOfJava.com");
			prop.storeToXML(fos, "Basic XML Property file.");
			fos.close();
			
			FileInputStream fis = new FileInputStream(propertiesFile);
			Properties propLoaded = new Properties();
			propLoaded.loadFromXML(fis);
			System.out.println(propLoaded);
			fis.close();
			
		} catch (Exception e) {
			System.out.println("Erorr is out!");
			e.printStackTrace();
		}
	}
}
