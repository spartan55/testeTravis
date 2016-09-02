package cc.engeld;

public class Quick implements SortElements {

    @Override
    public void sortItems(Integer[] elementos) {
        quickSort(elementos, 0, elementos.length - 1);
    }

    private void quickSort(Integer[] elementos, Integer inicio, Integer fim) {
        Integer pivo = elementos[inicio];
        Integer i = inicio;
        Integer j = fim;
        Integer aux;

        while (i < j) {
            for (; elementos[i].compareTo(pivo) == MENOR; i++);
            for (; elementos[j].compareTo(pivo) == MAIOR; j--);
            if (i <= j) {
                aux = elementos[i];
                elementos[i] = elementos[j];
                elementos[j] = aux;
                i++;
                j--;
            }
        }
        if (j > inicio) {
            quickSort(elementos, inicio, j);
        }
        if (i < fim) {
            quickSort(elementos, i, fim);
        }
    }
}
