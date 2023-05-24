public abstract class Shape {


    enum colors{

    red,blue,green,black;

    }
    boolean type;


    public double getArea(){

        return 0;

    }

    public double getPerimeter(){

        return 0;
    }


    public int getCounter(){

        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type=" + type +
                '}';
    }
}
