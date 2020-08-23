import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		// Question - https://www.codewars.com/kata/554ca54ffa7d91b236000023
    // Annoying part is so many initializations and conversions.
    
    List<Integer> numbers = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int number: elements) {
      if (map.containsKey(number)) {
        map.put(number, map.get(number)+1); 
      }
      else {
        map.put(number, 1);
      }
      
      if (map.get(number)<=maxOccurrences) {
        numbers.add(number);
      } 
    }
    int[] ans = numbers.stream().mapToInt(i->i).toArray();
    return ans;
	}

}
