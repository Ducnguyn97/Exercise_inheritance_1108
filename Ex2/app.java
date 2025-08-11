package Ex2;

import Ex2.src.Point2D;
import Ex2.src.Point3D;

public class app {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3,5) ;
        p1.setXY(3.0f, 4.0f);

        Point2D p2 = new Point3D(8,9,10);
        ((Point3D) p2).setXYZ(1.0f, 2.0f, 3.0f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
