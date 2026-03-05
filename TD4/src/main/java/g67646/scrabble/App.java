package g67646.scrabble;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public List<Letter> rack = new ArrayList<>();
    private Board board = new Board();
    private Bag bag = new Bag();
    private BoardView view = new BoardView();

    public static void main(String[] args) {
        App myApp = new App();
        myApp.run();
    }

    public void run(){
        this.rack = bag.draw(7);
        Scanner in = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            view.display(board);
            view.displayRack(this.rack);
            //System.out.println();
            input= in.nextLine();
            String[] tokens = input.split("\\s+");
            Direction d = Direction.VERTICAL;
            if (tokens[0].equals("set" )&& tokens.length > 4){
                if (tokens[3].equals("h")){
                    d = Direction.HORIZONTAL;
                }
                Letter[] letters = new Letter[tokens.length-4];
                for (int i=0; i<letters.length; i++){
                    letters[i] = rack.get(Integer.parseInt(tokens[i+4]));
                }
                board.setLetters(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),d,letters );
                for (Letter l : letters){
                  rack.remove(l);
                  rack.add(bag.draw());
                }
            }
            else if (tokens[0].equals("quit")){
                System.out.println("Merci d'avoir joué :) ");
            }
            else{
                System.out.println("La commande n'a pas été entièrement entrée, veuillez recommencer! ");
            }
        }
    }
}