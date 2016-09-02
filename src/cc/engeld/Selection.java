package cc.engeld;

public class Selection implements SortElements {

    @Override
    public void sortItems(Integer[] elementos) {
        Integer aux;
        Integer pont;

        for (Integer i = 0; i < elementos.length - 1; i++) {
            pont = i;
            for (Integer j = i + 1; j < elementos.length; j++) {
                if (elementos[j].compareTo(elementos[pont]) == MENOR) {   //if( elementos[j] < elementos[pont] ) { 
                    pont = j;
                }
            }
            aux = elementos[pont];
            elementos[pont] = elementos[i];
            elementos[i] = aux;
        }
    }

}
