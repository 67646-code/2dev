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
    Dictionary dictionary = new Dictionary();
    private int score = 0;

    public static void main(String[] args) {
        App myApp = new App();
        myApp.run();
    }

    public void run(){
        // draw 7 letter and put them in player rack
        this.rack = bag.draw(7);
        //scan to get the user word
        Scanner in = new Scanner(System.in);
        String input = "";
        // pricipal loop of game, not exiting while player input = 'quit'
        while (!input.equals("quit")){
            // display actual game state
            view.display(board);
            view.displayScores(getScore());
            view.displayRack(this.rack);
            // read the player input
            input= in.nextLine();
            //split input into tokens at space
            String[] tokens = input.split("\\s+");
            //default direction is Vertical
            Direction d = Direction.VERTICAL;

            // identify if the first token is "set"
            if (tokens[0].equals("set" )&& tokens.length > 4){
                //if the token 3 is h we need to change the direction
                if (tokens[3].equals("h")){
                    d = Direction.HORIZONTAL;
                }
                //initialize letters[] empty for now
                Letter[] letters = new Letter[tokens.length-4];

                // for each letter gave by player, we add it to letters[] to get final array
                    for (int i = 0; i < letters.length; i++) {
                        letters[i] = rack.get(Integer.parseInt(tokens[i + 4]));
                    }
                    // call a loop to get a word from array
                    String wordToTest = board.lettersToWord(letters);

                    // test if the word is in official dictionary if pass only we give instruction to setLetters
                    if (dictionary.isInDictionary(wordToTest)){
                    board.setLetters(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), d, letters);

                    for (Letter l : letters) {
                        //get the value of each placed letter and add it to the score
                        score = score + l.getValue();
                        // when the letter get placed we don't need them anymore in the rack
                        rack.remove(l);
                        // draw a letter for each we removed
                        rack.add(bag.draw());
                        }
                    }
            }
            // quit command break the loop
            else if (tokens[0].equals("quit")){
                System.out.println("Merci d'avoir joué :) ");
                break;
            }
            // unrecognized command
            else{
                System.out.println("La commande n'a pas été entièrement entrée, veuillez recommencer! ");
            }
        }
    }


    public int getScore(){
        return score;
    }
}
}