import java.util.Scanner;

public class Circle extends Shape {

    Scanner reader = new Scanner(System.in);
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void addRadius() {
        System.out.println("Please enter a radius: ");
        double radius = reader.nextDouble();
        this.radius = radius;
    }

    private double perimeterCircle() {
        double volume = Math.PI * 2 * this.radius;
        return volume;
    }

    @Override
    public double perimeterCalculation() {
        if (perimeterCircle() < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return perimeterCircle();
    }

    private double areaCircle() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    @Override
    public double areaCalculation() {
        if (areaCircle() < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return areaCircle();
    }

}
