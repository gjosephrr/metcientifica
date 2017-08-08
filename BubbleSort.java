package algoritmos;

/**
 * Created by Aillkeen on 07/08/2017.
 */
public class BubbleSort {

    public BubbleSort() {
    }

    public void bubbleSort(double[] vetor) {
        boolean troca = true;
        double aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
