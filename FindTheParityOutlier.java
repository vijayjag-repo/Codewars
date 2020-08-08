public class FindOutlier{
  static int find(int[] integers){
  // Question - https://www.codewars.com/kata/5526fc09a1bbd946250002dc
  // Just using basic loops to get it done. Not aware of short or intelligent ways to get around this in java.
    
    int count = 0;
    int ans = 0;
    
    // Inital check to find if integer array is odd or even
    for (int i=0;i<3;i++) {
      if (Math.abs(integers[i])%2==0) {
        count += 1;
      }
    }
    
    // If its even, find the odd one. If its odd, find the even one.
    if (count >= 2) {
      for (int i=0;i<integers.length;i++) {
        if (integers[i]%2!=0) {
          ans = integers[i];
          break;
        }
      }
    }
    else {
      for (int i=0;i<integers.length;i++) {
        if (integers[i]%2==0) {
          ans = integers[i];
          break;
        }
      }
    }
    
    return ans;
}}
