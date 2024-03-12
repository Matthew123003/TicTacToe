package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        int xCounter = 0;
        boolean xWins = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X') {
                    xCounter++;
                }
            }
            if (xCounter == 3) {
                xWins = true;
                xCounter= 0;
            }

        }
        return xWins;
    }

    public Boolean isInFavorOfO() {
        int oCounter = 0;
        boolean oWins = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'O') {
                    oCounter++;
                }

            }
            if (oCounter == 3) {
                oWins = true;
                oCounter = 0;
            }


        }
        return oWins;
    }


        //Check diagonals

    public Boolean isTie() {
        boolean tie = false;

        if(isInFavorOfX() == isInFavorOfO()){
            tie = true;
        }

        return tie;
    }

    public String getWinner() {
        String winner = "";

        if (isInFavorOfX() && !isInFavorOfO()) {
            winner = "X";
        }if(isInFavorOfO() && !isInFavorOfX()){
            winner = "O";
        }
        return winner;
    }

}
