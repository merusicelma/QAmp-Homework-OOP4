import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Circle myCircle = new Circle(0);
        Rectangular myRectangular = new Rectangular(0, 0);
        Triangle myTriangle = new Triangle(0, 0, 0);

        ArrayList<Shape> shape = new ArrayList<>();
        int answer;

        do {
            System.out.println("Perimeter and area calculation menu! Select the option you want: ");
            String[] menuOptions = {
                    "1.For a circle",
                    "2.For a rectangular",
                    "3.For a triangle",};
            for (String menuElements : menuOptions) {
                System.out.println(menuElements);
            }
            answer = reader.nextInt();

            switch (answer) {
                case 1:
                    myCircle.addRadius();
                    shape.add(new Circle(myCircle.getRadius()));
                    break;
                case 2:
                    myRectangular.addLengthWidth();
                    shape.add(new Rectangular(myRectangular.getLength(), myRectangular.getWidth()));
                    break;
                case 3:
                    myTriangle.addSideTriangle();
                    shape.add(new Triangle(myTriangle.getSideA(), myTriangle.getSideB(), myTriangle.getSideC()));
                    break;
                default:
                    System.out.println("You choose wrong answer!");
            }
            System.out.println("Do you want another option?");
            answer = reader.next().charAt(0);
        } while (answer == 'y' || answer == 'Y');
        result(shape);

    }

    public static void result(ArrayList<Shape> shape) {
        int i = 1;
        for (Shape result : shape) {
            try {
                System.out.println("Perimeter of " + i + " shape is: " + result.perimeterCalculation());
                System.out.println("Area of " + i + " shape is: " + result.areaCalculation());
                i++;
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
    }
}
