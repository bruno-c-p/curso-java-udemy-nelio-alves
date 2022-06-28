package files.file_writer_buffered.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\estudo\\JAVA - UDEMY - NELIO ALVES\\files\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //true to add

            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
