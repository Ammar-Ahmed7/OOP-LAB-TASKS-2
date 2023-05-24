import javax.swing.plaf.IconUIResource;

public class Rectangle extends Shape{
    private int length;
    private int width;
    static int counter2;

    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
        counter2++;
    }

    @Override
    public double getArea() {
        return super.getArea()+(length*width);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter()+2*(length+width);
    }

    @Override
    public int getCounter() {
        return super.getCounter()+counter2;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
