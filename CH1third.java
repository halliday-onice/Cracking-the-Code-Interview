import java.util.Arrays;
import java.util.Scanner;

/* Write a method to replace all spaces in a string with '%20'. As I am implementing in Java
 * I have to use the operation in place 
 */

public class CH1third {
      public static int CountSpaces(String inputString)
      {
            char [] temp = inputString.toCharArray();
            String repetition = "%20%";
            //a classe string builder eh mutavel
            /* A mutable sequence of characters. This class provides an API compatible with StringBuffer,
             but with no guarantee of synchronization.  */
            // StringBuilder stringInputBuilder =  new StringBuilder(inputString);

            

            int counter = 0;
            for(char ch: temp){
                  if(ch == ' ')
                  {

                        counter++;
                        inputString.replace(" ", repetition);
                        

                  }

                        
                        
            }
            System.out.println(inputString);



            return counter;


      }

      public static String replaceSpaces(char [] inputCharArr)
      {
            
            String repetition = "%20";
            String inputCharAsString = new String(inputCharArr);

            int arrSize = inputCharArr.length;
            for(int i =0; i < arrSize;i++){
                  if (inputCharArr[i] == ' '){
                       inputCharAsString = inputCharAsString.replace(" ", repetition);
                  }
            }
            return inputCharAsString;

      }

      public static void main(String args [])
      {
            String input1 = "Mr John Smith";

            int counter = CountSpaces(input1);
            System.out.println(counter);

            

            System.out.println(replaceSpaces(input1.toCharArray()));


      }
      
}
