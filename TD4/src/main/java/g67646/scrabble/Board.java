package g67646.scrabble;

public class Board {
    public static final int BOARD_SIZE = 15;
    private Letter[][] squares;


    int getValidRowCol(int x){
        if (x>=0 && x<BOARD_SIZE){
        return x;
        }
        else{
            return 0;
        }
    }

    public Board(){
        this.squares = new Letter[BOARD_SIZE][BOARD_SIZE];
    }

    public Letter get(int row, int col){
        return squares[row][col];
    }

    public boolean isRowColPossible(int lettersLength,int row,int col,Direction d){
        if (d == Direction.HORIZONTAL && col + lettersLength <= BOARD_SIZE){
            return true;
        } else return d == Direction.VERTICAL && row + lettersLength <= Board.BOARD_SIZE;
    }

    public boolean isBoxFree(int row, int col){
        return squares[row][col] == null ;
    }

    public boolean isRowColFree(Letter[] letters,int row,int col,Direction d) {
        if (d == Direction.HORIZONTAL) {
            for (int i = 0; i < letters.length; i++) {
                if (!isBoxFree(row, col +i)) {
                    return false;
                }
            }
            return true;
        } else if (d == Direction.VERTICAL) {
            for (int i = 0; i < letters.length; i++) {
                if (!isBoxFree(row +i, col)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String lettersToWord(Letter[] letters) {
        String word = "";
        for (Letter l : letters) {
            word += l.getLetter();
        }
        return word;
    }

    public void setLetters(int row, int col, Direction d,Letter[] letters){
        if ((isRowColPossible(letters.length, row, col,d) && isRowColFree(letters, row, col,d))) {
            if (d == Direction.HORIZONTAL) {
                //for (letter l : letters){
                //squares[row][col+letters.indexOf(l)] = l
                for (int i = 0; i < letters.length; i++) {
                    squares[row][col+i] = letters[i];
                }
            }
            else{
                for (int i=0 ; i<letters.length ; i++){
                    squares[row+i][col] = letters[i];
                }
            }
        }
        else{
            System.out.println("Les calculs sont pas bon Kévin");
        }
    }
}
