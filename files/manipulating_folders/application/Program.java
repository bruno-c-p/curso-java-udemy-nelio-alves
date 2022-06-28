package files.manipulating_folders.application;

import utils.Messages;

import java.io.File;

public class Program {

    public static void main(String[] args) {

        String stringPath = Messages.readString("Enter a folder path:");

        File path = new File(stringPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS:");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(stringPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully! " + success);
    }
}
