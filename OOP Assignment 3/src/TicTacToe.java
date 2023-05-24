import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class TicTacToe extends Game {

    enum cell {
        X, O, EMPTY;

    }

    @Override
    public String getPlayer1() {
        return super.getPlayer1();
    }

    @Override
    public String getPlayer2() {
        return super.getPlayer2();
    }

    private cell[][] chart = new cell[3][3];


    TicTacToe() {
        super();
    }



    public void setChart() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                chart[i][j] = cell.EMPTY;
            }
        }
    }


    public String gameBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" |");
                System.out.printf("%7s", chart[i][j]);
            }
            System.out.println();
            System.out.println(" -------   ------   -----");
        }
        return "";
    }


    public int start() {
        setChart();
      while(checkWinner()==1) {
          gameplayer1();
          checkWinner();
          gameplayer2();
          checkWinner();
      }
      return super.start();
    }

     public int restart(){
        Scanner sc=new Scanner(System.in);
         System.out.print("Wanna play again??? (y/n)= ");
         char in3=sc.next().charAt(0);
         if(in3=='y') {
             System.out.println();
            setPlayer1(player1);
            setPlayer2(player2);
            start();

         }
         else{
             exit(0);
         }
        return super.restart();
     }

     public int stop(){
      gameBoard();
      restart();
      return super.stop();
     }



      public void gameplayer1() {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print(player1 + " enter your number (1-9) = ");
            int in1 = sc.nextInt();
            while (in1 > 9) {
                System.out.println("Enter number within the given range");
                System.out.print(player1 + " enter your number (1-9) or enter 10 to Stop = ");
                in1 = sc.nextInt();
                if(in1== 10){
                    stop();
                }
            }
          while (validate(chart, in1)==false) {
              System.out.println("Sorry already entered here");
              System.out.println();
              System.out.print(player1 + " enter your number (1-9) = ");
              in1 = sc.nextInt();

          }

            switch (in1) {
                case 1:
                    chart[0][0] = cell.X;
                    break;
                case 2:
                    chart[0][1] = cell.X;
                    break;
                case 3:
                    chart[0][2] = cell.X;
                    break;
                case 4:
                    chart[1][0] = cell.X;
                    break;
                case 5:
                    chart[1][1] = cell.X;
                    break;
                case 6:
                    chart[1][2] = cell.X;
                    break;
                case 7:
                    chart[2][0] = cell.X;
                    break;
                case 8:
                    chart[2][1] = cell.X;
                    break;
                case 9:
                    chart[2][2] = cell.X;
                    break;
            }
            gameBoard();
        }






        public void gameplayer2() {
            Scanner sc=new Scanner(System.in);
            System.out.println();
            System.out.print(player2 + " enter your number (1-9) = ");
            int in2 = sc.nextInt();
            while (in2 > 9) {
                System.out.println("Enter number within the given range");
                System.out.print(player2 + " enter your number (1-9) = ");
                in2 = sc.nextInt();
            }

            while (validate(chart,in2)==false) {
                System.out.println("Sorry already entered here");
                System.out.println();
                System.out.print(player2 + " enter your number (1-9) = ");
                in2 = sc.nextInt();
            }

            switch (in2) {
                case 1:
                    chart[0][0] = cell.O;
                    break;
                case 2:
                    chart[0][1] = cell.O;
                    break;
                case 3:
                    chart[0][2] = cell.O;
                    break;
                case 4:
                    chart[1][0] = cell.O;
                    break;
                case 5:
                    chart[1][1] = cell.O;
                    break;
                case 6:
                    chart[1][2] = cell.O;
                    break;
                case 7:
                    chart[2][0] = cell.O;
                    break;
                case 8:
                    chart[2][1] = cell.O;
                    break;
                case 9:
                    chart[2][2] = cell.O;
                    break;
            }
            gameBoard();
        }





    public boolean validate(cell[][] chart,int v) {
        switch (v) {
            case 1:
                return (chart[0][0] == cell.EMPTY);
            case 2:
                return (chart[0][1] == cell.EMPTY);
            case 3:
                return (chart[0][2] == cell.EMPTY);
            case 4:
                return (chart[1][0] == cell.EMPTY);
            case 5:
                return (chart[1][1] == cell.EMPTY);
            case 6:
                return (chart[1][2] == cell.EMPTY);
            case 7:
                return (chart[2][0] == cell.EMPTY);
            case 8:
                return (chart[2][1] == cell.EMPTY);
            case 9:
                return (chart[2][2] == cell.EMPTY);
            default:
                return false;

        }

    }


    public int checkWinner(){
        if((chart[0][0] == cell.X && chart[0][1]== cell.X && chart[0][2]==cell.X))
             {
                 System.out.println();
                 System.out.println("player 1 = "+player1+ " wins");
                 restart();
             }
        if((chart[0][0] == cell.O && chart[0][1]== cell.O && chart[0][2]==cell.O))
             {
                 System.out.println();
                 System.out.println("player 2 = "+player2+ " wins");
                 restart();
             }
        if((chart[1][0] == cell.X && chart[1][1]== cell.X && chart[1][2]==cell.X))
        {
            System.out.println();
            System.out.println("player 1 = "+player1+ " wins");
            restart();
        }
        if((chart[1][0] == cell.O && chart[1][1]== cell.O && chart[1][2]==cell.O))
        {
            System.out.println();
            System.out.println("player 2 = "+player2+ " wins");
            restart();
        }
        if((chart[2][0] == cell.X && chart[2][1]== cell.X && chart[2][2]==cell.X))
        {
            System.out.println();
            System.out.println("player 1 = "+player1+ " wins");
            restart();
        }
        if((chart[2][0] == cell.O && chart[2][1]== cell.O && chart[2][2]==cell.O))
        {
            System.out.println();
            System.out.println("player 2 = "+player2+ " wins");
            restart();
        }


        if((chart[0][0] == cell.X && chart[1][0]== cell.X && chart[2][0]==cell.X))
        {
            System.out.println();
            System.out.println("player 1 = "+player1+ " wins");
            restart();
        }
        if((chart[0][0] == cell.O && chart[1][0]== cell.O && chart[2][0]==cell.O))
        {
            System.out.println();
            System.out.println("player 2 = "+player2+ " wins");
            restart();
        }
        if((chart[0][1] == cell.X && chart[1][1]== cell.X && chart[2][1]==cell.X))
        {
            System.out.println();
            System.out.println("player 1 = "+player1+ " wins");
            restart();
        }
        if((chart[0][1] == cell.O && chart[1][1]== cell.O && chart[2][1]==cell.O))
        {
            System.out.println();
            System.out.println("player 2 = "+player2+ " wins");
            restart();
        }
        if((chart[0][2] == cell.X && chart[1][2]== cell.X && chart[2][2]==cell.X))
        {
            System.out.println();
            System.out.println("player 1 = "+player1+ " wins");
            restart();
        }
        if((chart[0][2] == cell.O && chart[1][2]== cell.O && chart[2][2]==cell.O))
        {
            System.out.println();
            System.out.println("player 2 = "+player2+ " wins");
            restart();
        }


        if((chart[0][0] == cell.X && chart[1][1]== cell.X && chart[2][2]==cell.X))
        {
            System.out.println();
            System.out.println("player 1 = "+player1+ " wins");
            restart();
        }
        if((chart[0][0] == cell.O && chart[1][1]== cell.O && chart[2][2]==cell.O))
        {
            System.out.println();
            System.out.println("player 2 = "+player2+ " wins");
            restart();
        }
        if((chart[0][2] == cell.X && chart[1][1]== cell.X && chart[2][0]==cell.X))
        {
            System.out.println();
            System.out.println("player 1 = "+player1+ " wins");
            restart();
        }
        if((chart[0][2] == cell.O && chart[1][1]== cell.O && chart[2][0]==cell.O))
        {
            System.out.println();
            System.out.println("player 2 = "+player2+ " wins");
            restart();
        }

        return 1;

    }

    @Override
    public String toString() {
        return "TicTacToe{" +
                "player1='" + player1 + '\'' +
                ", player2='" + player2 + '\'' +
                  start() +
                '}';
    }


}