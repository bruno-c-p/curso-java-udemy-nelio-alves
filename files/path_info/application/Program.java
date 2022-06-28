package files.path_info.application;

import utils.Messages;

import java.io.File;

public class Program {

    public static void main(String[] args) {

        String stringPath = Messages.readString("Enter a file path: ");

        File path = new File(stringPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        System.out.println("getPath: " + path.getFreeSpace());
    }
}
