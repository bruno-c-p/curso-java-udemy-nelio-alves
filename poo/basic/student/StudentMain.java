package poo.basic.student;

import java.text.DecimalFormat;

import utils.Messages;

public class StudentMain {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");

        Student student = new Student();

        student.name = Messages.readString("Name: ");
        student.grade1 = Messages.readDouble("Grade 1: ");
        student.grade2 = Messages.readDouble("Grade 2: ");
        student.grade3 = Messages.readDouble("Grade 3: ");

        Messages.showMSG("FINAL GRADE: " + df.format(student.finalGrade()));

        if (student.finalGrade() < 60.0) {

            Messages.showMSG("FAILED");

            Messages.showMSG("MISSING " + df.format(student.missingPoints()) + " POINTS");

        } else {

            Messages.showMSG("PASS");
        }
    }
}
