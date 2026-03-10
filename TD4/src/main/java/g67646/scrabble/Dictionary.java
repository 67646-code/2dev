package g67646.scrabble;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private List<String> words;

    public Dictionary() {
        this.words = new ArrayList<>();
        String filename = "ods6.txt";
        System.out.println("loading dictionary from file: "+filename);
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        Scanner scan = new Scanner(is);
        while(scan.hasNext()) {
            words.add(scan.next()); // ajoute chacun des mots du fichier dans la liste.
        }
        System.out.println("dictionary loaded");
    }

    public boolean isInDictionary(String word) {
        return words.contains(word.toUpperCase());
    }
}
