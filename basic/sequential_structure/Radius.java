package basic.sequential_structure;

import java.text.DecimalFormat;

import utils.Messages;

public class Radius {

    /*
     * Write a program to read the value of the radius of a circle, 
     * and then display the value of the area of ​​this circle with four
     * decimal places.
     */

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".0000");

        double radius = Messages.readDouble("Circle radius: ");

        double area = Math.PI * Math.pow(radius, 2);

        Messages.showMSG("Area: " + df.format(area));
    }
}
