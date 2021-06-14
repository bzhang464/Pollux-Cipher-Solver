import java.util.ArrayList;

/**
 * Represents a Pollux cipher
 *
 * @author bzhang464
 */
public class Cipher {

    /**
     * Builds a list of all Pollux ciphers
     *
     * @param len length of the cipher
     * @return list of all Pollux ciphers
     */
    public ArrayList<String> allCiphers(int len) {
        ArrayList<String> list = new ArrayList<>();
        if(len==1) {
            list.add(".");
            list.add("-");
            list.add("x");
        } else {
            ArrayList<String> prev = allCiphers(len-1);
            for(String entry: prev) {
                list.add("." + entry);
                list.add("-" + entry);
                list.add("x" + entry);
            }
        }
        return list;
    }

    /**
     * Converts encrypted input to Morse Code
     *
     * @param digits the Pollux encrypted input
     * @param cipher the cipher used to decrypt
     * @return the input converted to Morse Code
     */
    public String convertToMorse(String digits, String cipher) {
        String result = "";
        for(int i=0;i<digits.length();i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            result = result + cipher.charAt(digit);
        }
        return result;
    }

}
