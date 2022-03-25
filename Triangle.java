import java.util.Scanner;

public class Triangle extends Shape {

    Scanner reader = new Scanner(System.in);
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void addSideTriangle() {
        System.out.println("Enter the sides of the Triangle: ");
        System.out.println("Enter side a: ");
        double a = reader.nextDouble();
        System.out.println("Enter side b: ");
        double b = reader.nextDouble();
        System.out.println("Enter side c: ");
        double c = reader.nextDouble();
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    private double perimeterTriangle() {
        return this.sideA + this.sideB + this.sideC;
    }


    @Override
    public double perimeterCalculation() {
        if (perimeterTriangle() < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return perimeterTriangle();
    }

    private double areaTriangle() {
        double s = perimeterTriangle() / 2;
        return s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC);
    }

    @Override
    public double areaCalculation() {
        if (perimeterTriangle() / 2 < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return areaTriangle();
    }


}
