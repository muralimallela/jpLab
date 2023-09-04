
import java.io.*;
import java.lang.*;
import java.io.File;

public class ListFilesUtil {
	public void listFilesAndFolders(String directoryName) {
		File directory = new File(directoryName);

		File[] fList = directory.listFiles();
		for (File file : fList) {
			System.out.println(file.getName());
		}
	}

	public void listFiles(String directoryName) {
		File directory = new File(directoryName);

		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}

	}

	public void listFolders(String directoryName) {
		File directory = new File(directoryName);

		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isDirectory()) {
				System.out.println(file.getName());
			}
		}
	}

	public void listFilesAndFilesSubDirectories(String directoryName) {
		File directory = new File(directoryName);

		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isFile()) {
				System.out.println(file.getAbsolutePath());
			} else if (file.isDirectory()) {
				listFilesAndFilesSubDirectories(file.getAbsolutePath());
			}
		}
	}

	public static void main(String[] args) {
		ListFilesUtil listFilesUtil = new ListFilesUtil();
		final String directoryLinuxMac = "/Users/loiane/test";
		final String directoryWindows = "D://";
		listFilesUtil.listFilesAndFolders(directoryWindows);
	}
}
