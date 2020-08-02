import java.util.*;

public class SpinWords {
  public String spinWords(String sentence) {
    /*
    Question : https://www.codewars.com/kata/5264d2b162488dc400000001
    */

    // FYI: Use StringBuilder() because String is immutable in Java.
    StringBuilder answer = new StringBuilder();
    // Split the string at whitespace and process each word
    for (String word: sentence.split(" ")) {
        StringBuilder temp = new StringBuilder();
        temp.append(word);
        // If length of word is >= 5, reverse it.
        // Else dont do anything (keep the word as is).
        if (word.length() >= 5) {
          temp = temp.reverse();
        }
        // Add this word to the answer string
        answer.append(temp+" ");   
    }
    // answer is a StringBuilder object.
    // Convert answer to String object using toString()
    // trim() basically removes the whitespace at start and end.
    return answer.toString().trim();
  }
}
