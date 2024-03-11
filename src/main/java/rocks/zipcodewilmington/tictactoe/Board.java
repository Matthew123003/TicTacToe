package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private char[][] board;
    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean checkWinner(){
        int n = 3;
        //Check rows
        for(int i = 0; i < n; i++){
            if(matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2] &&
                matrix[i][2] == matrix[i][0] && matrix[i][0] == player){
                return true;
            }
        }
        //Check columns
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i] &&
                matrix[2][i] == matrix[0][i] && matrix[0][i] == player){
                return true;
            }
        }
        //Check diagonals

        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
