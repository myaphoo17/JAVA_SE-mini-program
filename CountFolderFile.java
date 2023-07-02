import java.io.File;

public class CountFolderFile {
    public static void main(String[] args) {
        String path = "E:\\java_practice"; 
        int numFiles = 0;
        int numFolders = 0;

        File directory = new File(path);
        
        File[] filesList = directory.listFiles();
        if (filesList != null) {
            for (File file : filesList) {
            	
                if (file.isFile()) {
                    numFiles++;
                }
                
                else if (file.isDirectory()) {
                    numFolders++;
                }
            }
        }

        System.out.println(" files: " + numFiles);
        System.out.println("folders:  " + numFolders);
    }
}

