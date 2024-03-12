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
      return checkWinner('X');

    }


    public Boolean isInFavorOfO() {

        return checkWinner('O');
    }

    public boolean checkWinner(char player){


        //Check rows
        for(int i = 0; i < 3; i++){
            if(matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]
            && matrix[i][2] == matrix[i][0] && matrix[i][0] == player){
                return true;
            }
        }
        //Check columns
        for(int i = 0; i < 3; i++){
            if(matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i]
            && matrix[2][i] == matrix[0][i] && matrix[0][i] == player){
                return true;
            }
        }

        //Check diagonal
        if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]
        && matrix[2][2] == matrix[0][0] && matrix[0][0] == player){
            return true;
        }

        //Check diagonal
        if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]
        && matrix[2][0] == matrix[0][2] && matrix[0][2] == player){
            return true;
        }
        return false;
    }



    public Boolean isTie() {
        boolean tie = false;

        if(!isInFavorOfO() && !isInFavorOfX()){
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
