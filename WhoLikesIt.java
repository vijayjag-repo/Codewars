class Solution {
    public static String whoLikesIt(String... names) {
    
        /*
        Question - https://www.codewars.com/kata/5266876b8f4bf2da9b000362
        
        Just a bunch of if else ifs. Not much here
        */
        String empty_single = " likes this";
        String more = " like this";
        String and = " and ";
        int count = names.length;
        int ans_count = 0;
      
        if (count>=4) {
          ans_count = count - 2;
        }
      
        if (count==0) {
          return "no one"+empty_single;
        }
        else if (count==1) {
          return names[0]+empty_single;
        }
        else if (count==2) {
          return names[0]+and+names[1]+more;
        }
        else if (count==3) {
          return names[0]+", "+names[1]+and+names[2]+more;
        }
        else {
          return names[0]+", "+names[1]+and+String.valueOf(ans_count)+" others"+more;
        }
    
    }
}
