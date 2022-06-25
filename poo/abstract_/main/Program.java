package poo.abstract_.main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import poo.abstract_.entities.Circle;
import poo.abstract_.entities.Rectangle;
import poo.abstract_.entities.Shape;
import poo.abstract_.entities.enums.Color;
import utils.Messages;

public class Program {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(".00");
        List<Shape> shapes = new ArrayList<>();

        int n = Messages.readInt("Enter the number of shapes: ");

        for (int i = 1; i <= n; i++) {

            Messages.showMSG("Shape #" + i + " data: ");
            char rectOrCircle = Messages.readChar("Rectangle or circle (R/C)?");
            Color color = Color.valueOf(Messages.readString("Color: "));

            if (rectOrCircle == 'R') {

                double width = Messages.readDouble("Width: ");
                double height = Messages.readDouble("Height: ");

                shapes.add(new Rectangle(color, width, height));

            } else {

                double radius = Messages.readDouble("Radius: ");
                shapes.add(new Circle(color, radius));
            }
        }

        StringBuilder shapeList = new StringBuilder();
        shapeList.append("SHAPE AREAS: ");

        for (Shape shape : shapes) {
            shapeList.append(df.format(shape.area()) + "\n");
        }

        Messages.showMSG(shapeList.toString());
    }
}
