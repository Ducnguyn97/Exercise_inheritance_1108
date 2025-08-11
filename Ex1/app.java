package Ex1;

import Ex1.src.Circle;
import Ex1.src.Cylinder;

import java.awt.*;

public class app {
    public static void main(String[] args) {
        Circle circle = new Circle(3.2, "red");
        Circle cylinder = new Cylinder(3.2, "blue",5.9);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
