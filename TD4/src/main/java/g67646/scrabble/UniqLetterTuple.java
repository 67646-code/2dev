package g67646.scrabble;

public class UniqLetterTuple {
    private int Value;
    private char Letter;
    private int Nbr;

    public UniqLetterTuple(int Value, char Letter){
        this.Letter = Letter;
        this.Value = Value;
    }

    public char getLetter() {
        return Letter;
    }

    public int getNbr() {
        return Nbr;
    }

    public int getValue(){
        return Value;
    }
}
