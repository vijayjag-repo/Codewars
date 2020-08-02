import java.util.*;

public class SpinWords {
  public String spinWords(String sentence) {
    /*
    Question:

    Write a function that takes in a string of one or more words, 
    and returns the same string, 
    but with all five or more letter words reversed (Just like the name of this Kata). 
    Strings passed in will consist of only letters and spaces. 
    Spaces will be included only when more than one word is present.

    Examples: 
    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
    spinWords( "This is a test") => returns "This is a test" 
    spinWords( "This is another test" )=> returns "This is rehtona test"
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