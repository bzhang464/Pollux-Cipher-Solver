import java.util.HashSet;
import java.util.Scanner;
import java.io.InputStream;

/**
 * Represents a model of the English language
 *
 * @author bzhang464
 */
public class English {

    private final HashSet<String> words;

    /**
     * Creates an English model
     */
    public English() {
        words = new HashSet<>();
        InputStream in = this.getClass().getClassLoader()
                .getResourceAsStream("english.txt");
        Scanner scan = new Scanner(in);
        while(scan.hasNextLine()) {
            words.add(scan.nextLine());
        }
        scan.close();
    }

    /**
     * Gives the probability of a string being
     * in English
     *
     * @param str the input string
     * @return the probability of the input being English
     */
    public double probability(String str) {
        String[] wordarr = str.split(" ");
        int counter = 0;
        for(String word: wordarr) {
            if(words.contains(word)) {
                counter++;
            }
        }
        return counter/(double) wordarr.length;
    }

}
