package sorting;

protected void sort(Integer[] array, int leftIndex, int rightIndex) {

	for (int i = leftIndex - 1; i < (rightIndex - 1); i++) {

		int min = i;

		for (int j = i + 1; j < rightIndex; j++) {

			if (array[j].compareTo(array[min]) < 0) {

				min = j;
			}
		}

		Util.swap(array, i, min);
	}
}


