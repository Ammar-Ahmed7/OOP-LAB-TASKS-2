
public class Circle extends Shape{

    private double radius;
    static int counter1;


    Circle(double radius){
        this.radius=radius;
        counter1++;
    }

    @Override
    public double getArea() {
        return super.getArea()+(3.14*radius*radius);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter()+2*(3.14*radius);
    }

    @Override
    public int getCounter() {
        return super.getCounter()+counter1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
