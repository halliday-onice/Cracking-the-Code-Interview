import java.util.Arrays;

/* Perform an algorithm that perform basic string compression using the counts of repeated characters
 * for ex aabcccccaaa
 */


public class StringCompression {
      public static String countCharac(String s){
            int count = 0;
            String compressedString = "";
            for(int i =0; i < s.length() - 1;i++){
                  count++;
                  // se o item seguinte for diferente, preciso fazer o append
                  if(s.charAt(i) != s.charAt(i + 1)){ // essa ultima condicao eh pra nao ter o erro de out of the bounds
                        compressedString += s.charAt(i);
                        //System.out.println("sArray[i]: \n" + sArray[i]);
                        compressedString += "" + count ; // aqui percebi que so da pra concatenar usando string
                        //System.out.println(count);
                        count = 0;
                  }

            }
            // preciso conferir se antes do utimo caractere, tem um numero
            if(count > 0){
                  compressedString +=  s.charAt(s.length() - 1);
                  compressedString += "" + count;
            }


            
            return compressedString;

            
            
      }

      public static void main(String [] args ){
            String ex = new String("aaaabbbbbbbcccc");

            String out = countCharac(ex);
            System.out.println(out);


      }
}
