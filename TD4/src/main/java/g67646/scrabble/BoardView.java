package g67646.scrabble;

import java.util.List;

public class BoardView {

    public void display(Board board) {
        for (int i = 0; i < 15; i++) {
            System.out.println("+---".repeat(15) + "+");
            for (int j = 0; j < 15; j++) {
                Letter letter = board.get(i, j);
                if (letter != null) {
                    System.out.print("| " + letter.getLetter() + " ");
                } else {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
        }
        System.out.println("+---".repeat(15) + "+");
    }
    public void displayRack(List<Letter> rack) {
        System.out.println("Chevalet : ");
        for (Letter l : rack) {
            System.out.print("[" + l.getLetter() + "] ");
        }
        System.out.println();
    }
}
