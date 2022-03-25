import java.util.Scanner;

public class Circle extends Shape {

    Scanner reader = new Scanner(System.in);
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void addRadius() {
        System.out.println("Please enter a radius: ");
        this.radius = reader.nextDouble();
    }

    private double perimeterCircle() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public double perimeterCalculation() {
        if (perimeterCircle() < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return perimeterCircle();
    }

    private double areaCircle() {
        return Math.PI * this.radius * this.radius;
        
    }

    @Override
    public double areaCalculation() {
        if (areaCircle() < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return areaCircle();
    }

}
