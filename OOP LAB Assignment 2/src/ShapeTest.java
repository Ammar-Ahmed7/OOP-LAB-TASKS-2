import java.awt.*;

public class ShapeTest {
    public static void main(String args[]) {

        Circle c1 = new Circle(21);
        System.out.println("\n"+c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        Rectangle r1 = new Rectangle(12,32);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        printEachShapeCount(c1);
        printEachShapeCount(r1);


    }

    public static void printEachShapeCount(Shape shapes){
        System.out.println(shapes.getCounter());
    }
}
