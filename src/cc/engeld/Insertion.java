package cc.engeld;

public class Insertion implements SortElements {

    @Override
    public void sortItems(Integer[] elementos) {

        Integer aux, j;

        for (Integer i = 1; i < elementos.length; i++) {
            aux = elementos[i];
            j = i - 1;
            while ((j >= 0) && (aux.compareTo(elementos[j]) == MENOR)) {
                elementos[j + 1] = elementos[j];
                j--;
            }
            elementos[j + 1] = aux;
        }
    }
}
