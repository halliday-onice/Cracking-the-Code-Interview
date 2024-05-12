import java.util.Arrays;

/* Cheque permutacoes: Dada duas strings- Uma eh a permutacao de outra? Procure fazer as
 * operacoes in place
 * a funcao equals returna true se QUALQUER OBJETO seja igual a um segundo OBJETO que esta sendo
 * feita a comparacao
*/

public class CH1second {

      public static String sortStringFunction(String inputStr){
            // convertendo a String pra toCharArray- porque eu consigo usar o toCharArray()
            char [] temp = inputStr.toCharArray();
            Arrays.sort(temp);
            System.out.println(temp); //debug

            return new String(temp);


            

      }
      public static boolean isPermutation(String s1, String s2){
            s1 = sortStringFunction(s1);
            s2 = sortStringFunction(s2);
            if(s1.length() != s2.length()){
                  return false;
            } else{
                  return s1.equals(s2); // retrun true here
            }
      }

    public static void main( String [] args){

      String input1 = "LOLA"; 
      input1 = sortStringFunction(input1);
      String input2 = "LAOSK";
      input2 = sortStringFunction(input2);

      if(isPermutation(input1,input2) == true){
            System.out.println("Yes, it is a permutation");

      } else{
            System.out.println("No it is not a permutation");
      }
      



      }
}