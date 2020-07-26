public class Maskify {
    public static String maskify(String str) {
      int length = str.length();
      String part1 = new String();
      
      if (length > 4) {
        String part2 = str.substring(length-4);
        for (int i=0;i<length-4;i++) {
          part1 += '#';
        }
        return part1 + part2;
      }
      else {
        return str;
      }
         
    }
}
