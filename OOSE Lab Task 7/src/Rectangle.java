import java.util.Scanner;

public class Rectangle extends shape{

    private int length;
    private int width;

   Rectangle(){
       setLength();
       setWidth();
   }

    public int getLength() {
        return length;
    }

    public void setLength() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length for Rectangle = ");
        int ans2=sc.nextInt();
        this.length=ans2;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Width for Rectangle = ");
        int ans3=sc.nextInt();
        this.width=ans3;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle" + "\n" +
                "Area =  " + getArea() + "\n" +
                "Perimeter =  " + getPerimeter() + "\n" ;
   }
}
