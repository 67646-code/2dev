package g67646.scrabble;

public class board {
    private Letter[][] squares;

    int getValidRowCol(int x){
        if (x>0 && x<15){
        return x;
        }
        else{
            return 0;
        }
    }

    void getBoard(int row, int col){
        Letter[][] squares = new Letter[row][col];
    }

}
