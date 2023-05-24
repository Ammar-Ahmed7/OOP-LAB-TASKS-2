public class TicTacToe extends Game {
    enum choice {X,O,EMPTY};

    private choice[][]arr= new choice[3][3];

    public TicTacToe() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=choice.EMPTY;
            }

        }
    }



   /* public void setchart(){


    }*/
public void gameboard(){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {

            //System.out.println("|");
            System.out.println(" "+arr[i][j]);

        }
        System.out.println();

    }

}


}


