public class Demo {
    public static void main(String args[]) {
        calc c = new calc();
        c.sum(20,40);
        System.out.println("Sum = " +  c.sum(20,40));

      c.mult(50,90);
        System.out.println("Multiplication = " + c.mult(50,90));

      c.sub(90,30);
        System.out.println("Subtraction = " + c.sub(90,30));

    }



}
