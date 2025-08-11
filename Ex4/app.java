package Ex4;

import Ex4.src.Triangle;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        do {
            System.out.println("Enter the side 1 of the triangle");
            side1 = scanner.nextDouble();
            System.out.println("Enter the side 2 of the triangle");
            side2 = scanner.nextDouble();
            System.out.println("Enter the side 3 of the triangle");
            side3 = scanner.nextDouble();
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                System.out.println("Invalid Triangle, The sum any two sides must be great than the remaining side");
            }
        } while (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1);
        System.out.println("Enter the color of the triangle");
        String color = scanner.next();
        System.out.println("Filled or not filled");
        boolean filled = scanner.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3,  color, filled);
        System.out.println(triangle.toString());
    }
}
