# Basicamente, eh suficiente dizer que para ser uma permutacao de um palindromo
# a string nao pode ter mais que um charactere que seja impar
# Entao, a solucao sera bastante simples, criar um vetor em que ira guardar
# a informacao e incrementar cada letra que aparecer
# se o len desse vetor


def can_palindrome_permutate(s):
      #cria uma lista com 128 posicoes- por conta da tabela ASCII-
      char_counts = [0] * 128
      for ch in s:
            char_counts[ord(ch)] += 1
            
      #apenas para teste
      for i in range(len(char_counts)):
            if char_counts[i] > 0:
                  print(f"ASCII value {i}: {char_counts[i]}")
     
      counter = 0 #conta os impares
      for i in char_counts:
            #se o resto da divisao entre o char_counts e 2 for igual a zero, quer dizer entao que deu MATCH
            #logo estou iterando pela lista char_counts
            #e pra cada counter, checa se o resto da divisao por 2 
            # se counter eh impar, i %2 vai ser 1
            # se counter for par, i % 2 vai ser 0
            #basicamente acumula a quantidade de ocorrencias de 
            counter += i % 2
      
      return counter <= 1 #retorna true se counter <= 1
            

      
      


    


s = "radar"
s2 = "test"
s3 = "aab"
s4 = "racecar"
print(can_palindrome_permutate(s))
print(can_palindrome_permutate(s2))
print(can_palindrome_permutate(s3))
print(can_palindrome_permutate(s4))


