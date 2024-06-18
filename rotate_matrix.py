import math
import numpy as np

#rotate a matrix in 90 degrees. Can you do it in place?
#matriz n x n 

"""
for col in range(len(matrix[0])):
      print("col", col)
      for row in matrix:
            print(row[col])
"""
def rotate_matrix(matrix):
      n = len(matrix[0])
      for i in range (n):
            for j in range(i):
                  #a linha vira coluna e a coluna vira linha
                  matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
      for index in range(n):
            matrix[index].reverse()


def print_matrix(matrix):
      for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                  print(matrix[i][j], end = " ")
            print()

if __name__ == "__main__":
      matrix = [ [1, 2, 3],
          [4, 5, 6],
          [7, 8 , 9],
          ]
      rotate_matrix(matrix)
      print_matrix(matrix)