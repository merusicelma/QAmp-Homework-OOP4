import java.util.Scanner;

public class Rectangular extends Shape {

    Scanner reader = new Scanner(System.in);
    private double length;
    private double width;

    public Rectangular(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void addLengthWidth() {
        System.out.print("Enter length of rectangle: ");
        length = reader.nextDouble();
        System.out.print("Enter width of rectangle: ");
        width = reader.nextDouble();
        this.length = length;
        this.width = width;
    }

    private double perimeterRectangular() {
        double volume = 2 * (this.length + this.width);
        return volume;
    }

    @Override
    public double perimeterCalculation() {
        if (perimeterRectangular() < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return perimeterRectangular();
    }


    private double areaRectangular() {
        double are = this.length * this.width;
        return are;
    }

    @Override
    public double areaCalculation() {
        if (areaRectangular() < 0) {
            throw new IllegalArgumentException("Input is not valid!");
        }
        return areaRectangular();
    }

}
