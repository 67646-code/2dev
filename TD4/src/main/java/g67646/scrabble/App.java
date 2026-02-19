package g67646.scrabble;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args){
        Board board = new Board();
        Letter[] letters = new Letter[] {new Letter('A'), new Letter('B')};
        board.setLetters(0, 0, Direction.HORIZONTAL, letters);
        System.out.println(board.get(3,4)); // null
        System.out.println(board.get(0,1).getLetter()); //B
    }

}
