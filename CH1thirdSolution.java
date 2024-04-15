public class CH1thirdSolution {
       // %20
      static char[] replaceSpaces(char[] str, int trueLen)
      {
            int spaceCounter = 0, index, i = 0;

            for(i = 0; i < trueLen; i++){
                  if(str[i] == ' ')
                        spaceCounter++;
            }
            System.out.println(spaceCounter); // esta okay

            // essa multiplicacao por 2 significa o numero adicional de characteres
            // necessarios para trocar o caractere espaco por %20.
            // uma vez que cada espaco sera trocado por 3 caracteres, precisaremos de 2 novos
            // caracteres por cada linha 
            int newLen = trueLen + spaceCounter * 2;
            int newIndex = newLen - 1; // comecando do final

            char [] old_str = str;
            str = new char[newLen];
           
           System.out.println("newLen " + newLen);
            
            //a abordagem para esse problema foi de "andar para tras usando o vetor"
            for(i = trueLen - 1; i >= 0; i--){ // -1 devido ao caractere que indica o fim da linha
                  //System.out.println("i: " + i + ", index: " + newIndex);
                  if(old_str[i] == ' '){
                        str[newIndex] = '0';
                        str[newIndex - 1] = '2';
                        str[newIndex - 2] = '%';
                        newIndex = newIndex - 3;
                           
                  } else {
                        str[newIndex] = old_str[i];
                        newIndex--;
                  }
            }
            return str;

      }

      public static void main(String args [])
      {
            String input1 = "Mr John Smith "; 
            char[] inputArray = input1.toCharArray();
            inputArray = replaceSpaces(inputArray, input1.length());
            
            System.out.println(inputArray);
      }
      
}