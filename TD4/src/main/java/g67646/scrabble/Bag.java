package g67646.scrabble;

import java.util.*;

public class Bag {
    public int indice;
    public int nmb;
    public Letter oneLetter;
    private ArrayList<Letter> alphabet;
    private List<Letter> myBagOfLetters;

    private void getAlphabet(){
        alphabet.add(new Letter('a',9,1));
        alphabet.add(new Letter('b',2,3));
        alphabet.add(new Letter('c',2,3));
        alphabet.add(new Letter('d',3,2));
        alphabet.add(new Letter('e',15,1));
        alphabet.add(new Letter('f',2,4));
        alphabet.add(new Letter('g',2,2));
        alphabet.add(new Letter('h',2,4));
        alphabet.add(new Letter('i',8,1));
        alphabet.add(new Letter('j',1,8));
        alphabet.add(new Letter('k',1,10));
        alphabet.add(new Letter('l',5,1));
        alphabet.add(new Letter('m',3,2));
        alphabet.add(new Letter('n',6,1));
        alphabet.add(new Letter('o',6,1));
        alphabet.add(new Letter('p',2,3));
        alphabet.add(new Letter('q',1,8));
        alphabet.add(new Letter('r',6,1));
        alphabet.add(new Letter('s',6,1));
        alphabet.add(new Letter('t',7,1));
        alphabet.add(new Letter('u',6,1));
        alphabet.add(new Letter('v',2,4));
        alphabet.add(new Letter('x',1,10));
        alphabet.add(new Letter('y',1,10));
        alphabet.add(new Letter('z',1,10));
    }

    private int getnmb(Letter oneLetter){
        return oneLetter.getNmb();
    }

    private void addByIndexValue(){
        for (int i=0; i<alphabet.size();i++){
            addInMyBag(alphabet.get(i));
        }
    }

    private void addInMyBag(Letter oneLetter){
        for (int i=0; i<getnmb(oneLetter);i++){
            myBagOfLetters.add(oneLetter);
        }
    }

    public Bag(){
        myBagOfLetters = new ArrayList<>();
    }

}
