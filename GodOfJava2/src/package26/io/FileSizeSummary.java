package package26.io;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary {
	
	public FileSizeSummary() {
		String pattern = "#,##0.0#";
		formatter = new DecimalFormat(pattern);
	}
	
	public static void main(String[] args) {
		FileSizeSummary sample = new FileSizeSummary();
		String path = "C:" + File.separator + "godofjava";
		long sum = sample.printFileSize(path);
		System.out.println(path + "'s total size = " + sample.convertFileLength(sum));
	}
	
	public long printFileSize(String dirName) {
		File file = new File(dirName);
		long sum = 0;
		
		if(file.isDirectory()) {
			File [] listOfFiles = file.listFiles();
			for(File dumpFile : listOfFiles) {
				System.out.println(dumpFile);
				if(dumpFile.isFile()) {
					long size = dumpFile.length();
					System.out.println(dumpFile.getName() + " = " + convertFileLength(size));
					System.out.println();
					sum += size;
				} else {
					String tempDirName = dumpFile.getAbsolutePath();
					long temp = printFileSize(tempDirName);
					System.out.println(tempDirName + "'s size is " + convertFileLength(temp));
					sum += temp;
				}
			}
		}
		return sum;
	}
	DecimalFormat formatter = null;
	
	private final long KB = 1024;
	private final long MB = 1024 * 1024;
	private final long GB = 1024 * 1024 * 1024;

	private String convertFileLength(long fileLength) {
		if (fileLength < KB) {
			return fileLength + " b";
		} else if (fileLength < MB) {
			return formatter.format(1.0 * fileLength / KB) + " kb";
		} else if (fileLength < GB) {
			return formatter.format(1.0 * fileLength / MB) + " mb";
		} else {
			return formatter.format(1.0 * fileLength / GB) + " gb";
		}
	}
}
