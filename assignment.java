import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;d
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

abstract class ThreeDimensionalShape extends Shape {
    abstract double calculateVolume();
}

class Sphere extends ThreeDimensionalShape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cube extends ThreeDimensionalShape {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a shape:\n1. Triangle\n2. Circle\n3. Rectangle\n4. Sphere\n5. Cube");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter base length: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Area: " + triangle.calculateArea());
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area: " + circle.calculateArea());
                break;
            case 3:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area: " + rectangle.calculateArea());
                break;
            case 4:
                System.out.print("Enter radius: ");
                double sphereRadius = scanner.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);
                System.out.println("Area: " + sphere.calculateArea());
                System.out.println("Volume: " + sphere.calculateVolume());
                break;
            case 5:
                System.out.print("Enter side length: ");
                double cubeSide = scanner.nextDouble();
                Cube cube = new Cube(cubeSide);
                System.out.println("Area: " + cube.calculateArea());
                System.out.println("Volume: " + cube.calculateVolume());
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
