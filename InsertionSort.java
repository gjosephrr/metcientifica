package algoritmos;

/**
 * Created by Aillkeen on 07/08/2017.
 */
public class InsertionSort {

    public InsertionSort() {
    }

    public double[] sort(double[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            double atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;;
        }

        return vetor;
    }
}
