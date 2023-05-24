public class BasicCalculator {
    private int x;
    private int y;

    public BasicCalculator(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum(){
        return x+y;
    }

    public  int subtract(){
        return x-y;
    }

    public  int multiplication(){
        return x*y;
    }

    public  int division(){
        return x/y;
    }
}
