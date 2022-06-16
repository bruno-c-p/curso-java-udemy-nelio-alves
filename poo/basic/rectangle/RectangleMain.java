package poo.basic.rectangle;

import java.text.DecimalFormat;

import utils.Messages;

public class RectangleMain {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");

        Rectangle rect = new Rectangle();

        Messages.showMSG("Enter rectangle width and height:");
        rect.width = Messages.readDouble("Width: ");
        rect.height = Messages.readDouble("Height: ");

        Messages.showMSG("AREA = " + df.format(rect.area()));
        Messages.showMSG("PERIMETER = " + df.format(rect.perimeter()));
        Messages.showMSG("DIAGONAL = " + df.format(rect.diagonal()));
    }
}
