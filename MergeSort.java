package algoritmos;


	public class MergeSort{

		public void sort(double[] array, int indiceInicio, int indiceFim) {

			// Condicional que verifica a validade dos parâmetros passados.
			if (array != null && indiceInicio < indiceFim && indiceInicio >= 0 &&
					indiceFim < array.length && array.length != 0) {
				int meio = ((indiceFim + indiceInicio) / 2);

				sort(array, indiceInicio, meio);
				sort(array, meio + 1, indiceFim);

				merge(array, indiceInicio, meio, indiceFim);
			}

		}


		private void merge(double[] array, int indiceInicio, int meio, int indiceFim) {

			double[] auxiliar = new double[array.length];
			//Copiando o trecho da lista que vai ser ordenada
			for (int i = indiceInicio; i <= indiceFim; i++) {
				auxiliar[i] = array[i];
			}

			//Índices auxiliares
			int i = indiceInicio;
			int j = meio + 1;
			int k = indiceInicio;

			//Junção das listas ordenadas
			while (i <= meio && j <= indiceFim) {
				if (auxiliar[i] < auxiliar[j]) {
					array[k] = auxiliar[i];
					i++;
				} else {
					array[k] = auxiliar[j];
					j++;
				}
				k++;
			}

			//Append de itens que não foram usados na Junção
			while (i <= meio) {
				array[k] = auxiliar[i];
				i++;
				k++;
			}

			//Append de itens que não foram usados na Junção
			while (j <= indiceFim) {
				array[k] = auxiliar[j];
				j++;
				k++;
			}
		}
	}
