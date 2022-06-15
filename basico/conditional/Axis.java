package basico.conditional;

import utils.Messages;

public class Axis {

    /*
     * Read 2 values ​​with one decimal place (x and y), 
     * which should represent the coordinates from a point on a plane. 
     * Next, determine which quadrant the point, 
     * or if it is on one of the Cartesian axes or at the origin (x = y = 0).
     * If the point is at the origin, write the message “Origin”.
     * If the point is on one of the axes, write “Axis X” or “Axis Y”, 
     * depending on the situation.
     *     |y
     *     |
     *  Q2 | Q1
     * --------- x
     *     |
     *  Q3 | Q4
     *     |
     */

    public static void main(String[] args) {

        double x = Messages.readDouble("Value X: ");
        double y = Messages.readDouble("Value Y: ");
        
        if (x < 0 && y < 0) {

            Messages.showMSG("Q3");

        } else if (x > 0 && y > 0) {

            Messages.showMSG("Q1");

        } else if (x < 0 && y > 0) {

            Messages.showMSG("Q2");

        } else if (x > 0 && y < 0) {

            Messages.showMSG("Q4");

        } else if (x == 0 && y != 0) {

            Messages.showMSG("Axis X");

        } else if (y == 0 && x != 0) {

            Messages.showMSG("Axis Y");

        } else {

            Messages.showMSG("Origin");
        }
    }
}
