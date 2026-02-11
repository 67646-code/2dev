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
    public board(){
        Letter[][] squares = new Letter[15][15];
    }

    /*public Letter getLetter(int row, int col){
        return squares[row][col];
    }
    */
    public boolean isBoxFree(int row, int col){
        return squares[row][col] == null ;
    }

    public boolean isRowColFree(Letter[] letters,int row,int col,Direction d) {
        if (d == Direction.horizontal) {
            int i = 0;
            while (i < letters.length && isBoxFree(row, col)) {
                row += 1;
                i += 1;
            }
            return i == letters.length-1;

        } else if (d == Direction.vertical) {
            int i = 0;
            while (i < letters.length && isBoxFree(row, col)) {
                col += 1;
                i += 1;
            }
            return i == letters.length-1;
        }
        else{
            return false ;
        }
    }


    public void setLetters(int row, int col, Direction d,Letter[] letters){
        if (isRowColFree(letters, row, col,d)){
            for ()
        }
        /* in letter[x][y] put 'a' and other will follow afou
        /* if row or collum not free or 'a'[][] - row or collum = -0  dont do the action
         */
    }
}
