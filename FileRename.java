package Assignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileRename {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		File file = new File(fname);
		
		if (file.exists()) {
			int i = 1;
			while (true) {
				String newFileName = fname + "_" + i;
				File newFile = new File(newFileName);
				
				if (newFile.exists()) {
					i++;
				} else {
					file.renameTo(newFile);
					System.out.println("File renamed");
					break;
				}
			}
		} else {
			Path p = Paths.get(fname);
			Path createdPath = Files.createFile(p);
			System.out.println("File created ");
		}
	}
}
