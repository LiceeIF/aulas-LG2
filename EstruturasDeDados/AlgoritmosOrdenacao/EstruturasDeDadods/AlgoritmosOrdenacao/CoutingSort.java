package EstruturasDeDadods.AlgoritmosOrdenacao;

import java.util.ArrayList;

public class CountingSort {
          public static void main(String[] args) {
              int[] arr = {1, 9, 1, 3, 4, 7, 6, 7};
              int[] sortedArr = countingSort(arr, 10); // 10 é o valor máximo do array de entrada
      
              System.out.println("Array original: " + Arrays.toString(arr));
              System.out.println("Array ordenado: " + Arrays.toString(sortedArr));
          }
      
          public static int[] countingSort(int[] A, int k) {
              int[] C = new int[k]; // array de contagem
              int[] B = new int[A.length]; // array de saída
      
              // Passo 1: contar a frequência dos elementos em A
              for (int i = 0; i < A.length; i++) {
                  C[A[i]] += 1;
              }
      
              // Passo 2: atualizar C para que cada elemento
              // indique a posição correta em B
              for (int i = 1; i < k; i++) {
                  C[i] += C[i - 1];
              }
      
              // Passo 3: iterar do fim ao início de A,
              // registrando em B os elementos na posição correta
              for (int i = A.length - 1; i >= 0; i--) {
                  B[C[A[i]] - 1] = A[i];
                  C[A[i]] -= 1;
              }
      
              return B;
          }
      }
      