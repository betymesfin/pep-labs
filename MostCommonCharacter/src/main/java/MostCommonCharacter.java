
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
          
        int[] count = new int[str.length()];  
        char maxChar = str.charAt(0);  
        int i, j, max;          
        char string[] = str.toCharArray(); 
        
          
          
        for(i = 0; i < string.length; i++) {  
            count[i] = 1;  
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    count[i]++;  
                      
                      
                    string[j] = '0';   
          
    }
    }
   }
  
  //Determine minimum and maximum occurring characters  
  max = count[0];  
  for(i = 0; i <count.length; i++) {  
        
      //If max is less than frequency of a character   
      //then, store frequency in max and corresponding character in maxChar  
      if(max < count[i]) {  
          max = count[i];  
          maxChar = string[i];  
      }  
  }  
  return maxChar;
}
}

        