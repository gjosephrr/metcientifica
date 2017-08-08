package algoritmos;

/**
 * Created by Gabriel on 07/08/2017.
 */
public class CombSort {

    public CombSort() {
    }
    protected void sort(double[] array,int leftIndex, int rightIndex) {
        int gap = rightIndex - leftIndex + 1;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1){
                gap = (int) (gap / 1.25);
            }
            int i = leftIndex;
            swapped = false;
            while (i + gap <= rightIndex) {
                if (array[i].compareTo(array[i + gap]) > 0) {
                	Util.swap(array, i, i + gap);
                    swapped = true;
                }
                i++;
            }
        }
    }
}
