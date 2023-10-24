package EstruturasDeDados;


public class RandomArrayGenerator {
          public static int[] generateRandomArray(int n, long seed) {
              int[] arr = new int[n];
              Random rand = new Random(seed);
              for (int i = 0; i < n; i++) {
                  arr[i] = rand.nextInt();
              }
              return arr;
          }
        }