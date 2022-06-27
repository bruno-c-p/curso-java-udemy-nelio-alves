package poo.exception_handling.main;

import utils.Messages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        method1();

        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    private static void method1() {
        System.out.println("METHOD 1 START");
        method2();
        System.out.println("METHOD 1 END");
    }

    public static void method2() {

        try {
            System.out.println("METHOD 2 START");
            String[] vector = Messages.readString("Names: ").split(" ");
            int position = Messages.readInt("Position: ");
            System.out.println(vector[position]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid position!");
            e.printStackTrace();

        } catch (InputMismatchException e) {

            System.out.println("Input error!");

        } finally {
            System.out.println("End of program!");
        }

        System.out.println("METHOD 2 END");
    }
}
