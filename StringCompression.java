import java.util.Arrays;

/* Perform an algorithm that perform basic string compression using the counts of repeated characters
 * for ex aabcccccaaa
 */


public class StringCompression {
      public static String countCharac(String s){

            if(s == null || s.length() == 0)
                  return "";

            // stringBuilders are more efficient and are mutable, diferently from String 
            StringBuilder compressedString = new StringBuilder();
            
            int count = 0;
            
            for(int i = 0; i < s.length(); i++) {
                  count++;
                  // i + 1 >= s.length() is to avoid the string out of index value
                  // This tells the code that it's the last character, and there's no need to check for a next character using s.charAt(i + 1).
                  if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)){ // if the next character
                        // is bigger than the length of string OR the actual is different from the next you can count
                        compressedString.append(s.charAt(i));
                        compressedString.append(count);
                        count = 0;
                  }
                  
                  
            }
            //compressedString.append(s.charAt(s.length() - 1));
            //compressedString.append(count);
 
            return compressedString.toString();

            
            
      }

      public static void main(String [] args ){
            String ex = new String("aaaabb");

            String out = countCharac(ex);
            System.out.println(out);


      }
}
