import java.util.Scanner;
public class Game {

    protected String player1;
    protected String player2;


    public Game() {
        setPlayer1(player1);
        setPlayer2(player2);
    }



    public void setPlayer1(String player1) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of player 1= ");
        String in1=sc.next();
         this.player1=in1;
    }


    public void setPlayer2(String player2) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of player 2= ");
        String in2=sc.next();
        this.player2=in2;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }
    public int start(){
        return 0;
    }
    public int stop(){
        return 0;
    }
    public int restart(){
        return 0;
    }
}
