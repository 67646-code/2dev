package g67646.scrabble;

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
            if (input.contains("set")){
                input.replaceFirst("set"," ");
                String[] elements = input.split("\\s+");
            }
            else-if (input.length() != 13){
                System.out.println("La commande n'a pas été entièrement entrée, veuillez recommencer!");
            }
            else{
                System.out.println("Merci d'avoir joué :) ");
            }
        }

    }

}