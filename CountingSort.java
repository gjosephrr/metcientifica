package algoritmos;

/**
 * Created by Gabriel on 07/08/2017.
 */
public class CountingSort {

    public CountingSort() {
    }

    protected void sort(double[] array, int leftIndex, int rightIndex) {
		
	    int arraySize = (rightIndex-leftIndex)+1;
	    Integer[] arrayk = new Integer[100];
	    Integer[] arrayb = new Integer[arraySize+1];
	
	
	    for (int i = 0; i < arrayk.length; i++) {
		    arrayk[i] = 0;
	    }
	    for (int i = 0; i < arrayb.length; i++) {
		    arrayb[i] = 0;
	    }
	
	    for (int j = leftIndex; j <= rightIndex ; j++) {
		    arrayk[array[j]] = arrayk[array[j]] + 1;
	    }
	
	    for (int i = 1; i < arrayk.length; i++) {
		    arrayk[i] = (arrayk[i] + arrayk[i - 1]);
	    }

	    for (int j = rightIndex; j >= leftIndex ; j--) {
		    arrayb[(arrayk[array[j]])-1] = array[j];
		    arrayk[array[j]] = (arrayk[array[j]] - 1);
	    }

	    for (int k = leftIndex; k <= rightIndex  ; k++) {
		    array[k] = arrayb[k - leftIndex];
	    }

    }

}
