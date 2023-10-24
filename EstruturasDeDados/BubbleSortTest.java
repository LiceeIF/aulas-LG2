package EstruturasDeDados;

public class BubbleSortTest {
          public static void main(String[] args) {
              int[] arr = {5, 3, 8, 4, 2,6,7,8,4,5,66,1,23,124,33,55};
              long ta = 0;
              for (int i = 0; i < 1000; i++) {
                  long ti = System.nanoTime();
                  BubbleSort.sort(arr);
                  long tf = System.nanoTime();
                  long td = tf - ti;
                  System.out.println(td + " ns para ordenar");
                  ta += td; 
              }
              System.out.println(ta/1000 + " ns tempo médio para ordenar");
              for(int i=0; i < arr.length; i++){
                  System.out.print(arr[i] + " ");
              }
          }
      }