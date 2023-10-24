import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        double[] array = {0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51};
        bucketSort(array);
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    public static void bucketSort(double[] array) {
        int n = array.length;
        ArrayList<Double>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Double>();
        }

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * array[i]);
            buckets[bucketIndex].add(array[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                array[index++] = buckets[i].get(j);
            }
        }
    }
}








