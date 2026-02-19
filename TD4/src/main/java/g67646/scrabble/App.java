package g67646.scrabble;

public class App {

    public static void main(String[] args) {

        Board board = new Board();
        Letter[] letters = new Letter[]{
                new Letter('A', 1, 1),
                new Letter('B', 1, 3)
        };

        board.setLetters(0, 0, Direction.HORIZONTAL, letters);

        System.out.println(board.get(3, 4));
        System.out.println(board.get(0, 1).getLetter());
    }
}