import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Problem - https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
    
    // Declare Hashmap which has a character as key and Integer as value.
    Map<Character,Integer> map = new HashMap<>();
    int ans = 0;
    // Convert string to character array.
    char[] chars = text.toCharArray();
    
    // Iterating over the character array
    for (char letter: chars){
      // Convert to lowercase
      char lower = Character.toLowerCase(letter);
      // If character is present already, increase count, else, add as new character.
      if (map.containsKey(lower)) {
        map.put(lower,map.get(lower)+1);
      }
      else {
        map.put(lower,1);
      }
    }
    
    // For each entry in the Hashmap, if the value is greater than 1 (key is present more than once), increase count
    for (Map.Entry<Character,Integer> entry: map.entrySet()) {
      if (entry.getValue()>1) {
        ans += 1;
      }
    }
    
    return ans;
    
  }
}
