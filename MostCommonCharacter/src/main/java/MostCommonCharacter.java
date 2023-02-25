
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
          
        int[] freq = new int[str.length()];  
        char maxChar = str.charAt(0);  
        int i, j, max;          
        char string[] = str.toCharArray(); 
        
          
        //Count each word in given string and store in array freq  
        for(i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';   
          
    }
    }

        