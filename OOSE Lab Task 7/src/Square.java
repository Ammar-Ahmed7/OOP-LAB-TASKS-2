import java.util.Scanner;

public class Square extends shape{

  private int length;



    Square(){
       setLength();
    }



    public int getLength() {
        return length;
    }

    public void setLength() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Length for Square = ");
        int ans2=sc.nextInt();
        this.length=ans2;
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public String toString() {
        return "Square " + "\n" +
                "Area = " + getArea() + "\n"+
                "Perimeter = " + getPerimeter();
    }
}
