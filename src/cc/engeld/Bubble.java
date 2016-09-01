public class Bubble implements SortElements {

    @Override
    public void sortItems(Integer[] elementos) {
        Integer aux;
        for (Integer i = 0; i < elementos.length - 1; i++) {
            for (Integer j = 0; j < elementos.length - 1; j++) {
                if (elementos[j].compareTo(elementos[j + 1]) == MAIOR) {
                    aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }
            }
        }
    }
}
