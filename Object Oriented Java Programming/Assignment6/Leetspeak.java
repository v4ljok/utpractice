import java.util.HashMap;
import java.util.Map;

public class Leetspeak extends Encoder {
    private static final Map<Character, String> dictionary;
    static {
        dictionary = new HashMap<>();
        dictionary.put('a', "4");
        dictionary.put('A', "4");
        dictionary.put('e', "3");
        dictionary.put('E', "3");
        dictionary.put('l', "1");
        dictionary.put('L', "1");
        dictionary.put('m', "/^^\\");
        dictionary.put('M', "/^^\\");
        dictionary.put('o', "0");
        dictionary.put('O', "0");
        dictionary.put('u', "_");
        dictionary.put('U', "_");
    }

    public String encode(String input) {
        if (input == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (dictionary.containsKey(c)) {
                sb.append(dictionary.get(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
