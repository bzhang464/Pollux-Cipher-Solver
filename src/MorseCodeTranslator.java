import java.util.HashMap;

/**
 * Represents a Morse Code translator
 *
 * @author bzhang464
 */
public class MorseCodeTranslator {

    private HashMap<String,String> template;

    /**
     * Creates a Morse Code Translator
     */
    public MorseCodeTranslator() {
        template = new HashMap<String,String>();
        template.put(".-","a");
        template.put("-...","b");
        template.put("-.-.","c");
        template.put("-..","d");
        template.put(".","e");
        template.put("..-.","f");
        template.put("--.","g");
        template.put("....","h");
        template.put("..","i");
        template.put(".---","j");
        template.put("-.-","k");
        template.put(".-..","l");
        template.put("--","m");
        template.put("-.","n");
        template.put("---","o");
        template.put(".--.","p");
        template.put("--.-","q");
        template.put(".-.","r");
        template.put("...","s");
        template.put("-","t");
        template.put("..-","u");
        template.put("...-","v");
        template.put(".--","w");
        template.put("-..-","x");
        template.put("-.--","y");
        template.put("--..","z");
    }

    /**
     * Translates a Morse Code string
     *
     * @param str a message in Morse Code
     * @return the translated string
     */
    public String translate(String str) {
        String[] words = str.split("xx");
        String result = "";
        for(String word: words) {
            String[] letters = word.split("x");
            for(String code: letters) {
                if(template.get(code) == null) {
                    throw new IllegalArgumentException();
                }
                result += template.get(code);
            }
            result += " ";
        }
        return result;
    }

}
