package g67646.scrabble;

public class Letter {
    private char letter;
    private int nmb;
    private int value;


    public Letter(char letter, int nmb, int value){
        this.nmb = nmb;
        this.letter = letter;
        this.value = value;
    }

    public char getLetter(){
        return this.letter;
    }

    public int getNmb(){
        return this.nmb;
    }

    public int getValue(){
        return this.value;
    }
}
