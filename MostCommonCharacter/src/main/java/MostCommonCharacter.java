import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char[] ch = new char[str.length()];
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        int max = 0; 
        char result = ' ';
 
        
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i],0);

            if (max < ch[str.charAt(i)]) {
                max = ch[str.charAt(i)];
                result = str.charAt(i);
            }
        }
 
        return result;
    }
}
        