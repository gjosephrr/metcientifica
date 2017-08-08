package algoritmos;

/**
 * Created by Gabriel on 07/08/2017.
 */
public class GnomeSort {

    public GnomeSort() {
    }
    protected void sort(Integer[] array, int leftIndex, int rightIndex) {
	    int pos = leftIndex + 1;
	    while (pos <= rightIndex) {
		    if (array[pos].compareTo(array[pos - 1]) >= 0) {
			    pos++;
		    } else {
			    Util.swap(array, pos, pos - 1);
			    if (pos > leftIndex + 1) {
				    pos--;
			    } else {
				    pos++;
			    }
		    }
	    }
    }
}
