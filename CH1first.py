#Implement an algorithm to determine if a string has all unique characters

#Ex: "aaabbccdaa"
#No
#abcd
#YES

def string_unique(str):
      n = len(str)
      for i in range(n):
            for j in range(i + 1,n):
                  if str[i] == str[j]:
                        return False
            
      return True 

if __name__ == '__main__':
      string = "aabcd"
      if string_unique(string):
            print("YES")
      else:
            print("NO")