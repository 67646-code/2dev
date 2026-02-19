package g67646.scrabble;

public class Board {
    private Letter[][] squares;


    int getValidRowCol(int x){
        if (x<0 && x<15){
        return x;
        }
        else{
            return 0;
        }
    }
    public Board(){
        this.squares = new Letter[15][15];
    }

    // Inutile

    public Letter get(int row, int col){
        return squares[row][col];
    }

    public boolean isRowColPossible(int lettersLength,int row,int col,Direction d){
        if (d == Direction.HORIZONTAL && col + lettersLength <= 15){
            return true;
        } else return d == Direction.VERTICAL && row + lettersLength <= 15;
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
                return true;
            }
        } else if (d == Direction.VERTICAL) {
            for (int i = 0; i < letters.length; i++) {
                if (!isBoxFree(row +i, col)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void setLetters(int row, int col, Direction d,Letter[] letters){
        if (isRowColPossible(letters.length, row, col,d) && isRowColFree(letters, row, col,d)){
            if (d == Direction.HORIZONTAL) {
                for (int i = 0; i < letters.length; i++) {
                    squares[row][col] = letters[i];
                    col += 1;
                }
            }
            else{
                for (int i=0 ; i<letters.length ; i++){
                    squares[row][col] = letters[i];
                    row += 1;
                }
            }
        }
        else{
            System.out.println("Les calculs sont pas bon Kévin");
        }
    }
}
