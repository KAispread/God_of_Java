package package26.Writer;

import static java.io.File.separator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManageTextFile {

	public static void main(String[] args) {
		ManageTextFile manager = new ManageTextFile();
		int numberConunt = 10;
		String fullPath = separator + "godofjava" + separator + "text" + separator + "numbers.text";
		String Path = separator + "godofjava" + separator + "text";
		
		manager.mkDir(Path);
		manager.readFileWithScanner(fullPath);
	}

	public void mkDir(String fullPath) {
		File file = new File(fullPath);
		file.mkdirs();
	}

	public void writeFile(String fileName, int numberCount) {
		FileWriter fileWriter = null;
		BufferedWriter bufferWriter = null;
		try {
			fileWriter = new FileWriter(fileName);
			bufferWriter = new BufferedWriter(fileWriter);
			for (int i = 0; i <= numberCount; i++) {
				bufferWriter.write(Integer.toString(i));
				bufferWriter.newLine();
			}
			System.out.println("Write Success!!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferWriter != null) {
				try {
					bufferWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	public void readFile(String fileName) {
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		try {
			fileReader = new FileReader(fileName);
			bufferReader = new BufferedReader(fileReader);
			String data;
			while( (data = bufferReader.readLine()) != null ) {
				System.out.println(data);
			}
			System.out.println("Read Success!!");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(bufferReader != null) {
				try {
					bufferReader.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void readFileWithScanner(String fileName) {
		File file = new File(fileName);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while( scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("Read Success!!");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
	}
}
