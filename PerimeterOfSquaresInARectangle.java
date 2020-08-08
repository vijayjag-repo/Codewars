import java.math.BigInteger;
public class SumFct {
  public static BigInteger perimeter(BigInteger n) {
    // Question - https://www.codewars.com/kata/559a28007caad2ac4e000083
    
    BigInteger first = BigInteger.valueOf(1);
    BigInteger second = BigInteger.valueOf(1);
    BigInteger third = first.add(second);
    BigInteger ans = third;
    
    for(int i=1;i<n.intValue();i++) {
      third = first.add(second);
      ans = ans.add(third);
      first = second;
      second = third;
    }
    
    BigInteger answer = ans.multiply(BigInteger.valueOf(4));
    return answer;
  
  }
}
