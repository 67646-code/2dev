package g67646.scrabble;

public class Letter {
    private char letter;
    private int nmb;
    private int Value;


    public Letter(char letter, int nmb, int Value){
        this.nmb = nmb;
        this.letter = letter;
        this.Value = Value;
    }

    public static char getLetter(){
        return this.letter;
    }

    public static int getNmb(){
        return this.nmb;
    }


}
