import java.util.Scanner;
public class Circle extends shape {

  private double radius;

    Circle(){
        setRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of Circle = ");
        double inp=sc.nextDouble();
        this.radius = inp;
    }

    @Override
    public double getArea() {
       double ans= 3.14*getRadius();
       return ans;
    }

    @Override
    public double getPerimeter() {
        double per = 2 * 3.14 * getRadius();
        return per;
    }

    @Override
    public String toString() {
        return "Circle " + "\n" +
                "Area =  "+ getArea() + "\n" + "Perimeter =  " + getPerimeter();

    }
}
