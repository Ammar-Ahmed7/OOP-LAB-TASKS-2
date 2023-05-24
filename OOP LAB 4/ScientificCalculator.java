import java.lang.Math;

public class ScientificCalculator extends BasicCalculator{
    private int z;
    private double a;

    public ScientificCalculator(int x, int y, int z, double a){
        super(x, y);
        this.z=z;
        this.a=a;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public int sum(){
        return  (super.sum())+z;
    }
    public int multiplication(){
        return  (super.multiplication())*z;
    }

    public double cos(){
        return Math.cos(a);
    }
    public double sin(){
        return Math.sin(a);
    }

}
