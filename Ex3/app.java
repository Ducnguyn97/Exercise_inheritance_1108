package Ex3;

import Ex3.src.MoveablePoint;
import Ex3.src.Point;

public class app {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        p1.setXY(8,9);
        System.out.println(p1.toString());

        Point p1move = new MoveablePoint(2,2);
        p1move.setXY(8,9);
        ((MoveablePoint)p1move).move(3,3);
        System.out.println(((MoveablePoint)p1move).toString());
        ((MoveablePoint)p1move).move(3,3);
        System.out.println(((MoveablePoint)p1move).toString());
        ((MoveablePoint)p1move).move(3,3);
        System.out.println(((MoveablePoint)p1move).toString());
    }
}
