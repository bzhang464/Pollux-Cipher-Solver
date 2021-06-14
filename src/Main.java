import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class that runs the Pollux Solver
 *
 * @author bzhang464
 */
public class Main {

    /**
     * Runs the Pollux Solver
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Pollux-encrypted string");
        String input = scan.nextLine();
        scan.close();
        MorseCodeTranslator translator = new MorseCodeTranslator();
        Cipher pollux = new Cipher();
        English english = new English();
        ArrayList<String> cipherlist = pollux.allCiphers(10);
        double highestprob = 0;
        String message = "Please check that you are submitting valid input.";
        for(String cipher: cipherlist) {
            String morse = pollux.convertToMorse(input,cipher);
            try{
                String plaintext = translator.translate(morse);
                double prob = english.probability(plaintext);
                if(highestprob == 0 || (prob>highestprob)) {
                    highestprob = prob;
                    message = plaintext;
                }
            } catch(IllegalArgumentException e) {
                continue;
            }
        }
        System.out.println(message.toUpperCase());
    }
}

