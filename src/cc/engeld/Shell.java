package cc.engeld;

public class Shell implements SortElements {

    @Override
    public void sortItems(Integer[] elementos) {
        
        Integer aux;
        
        for(Integer intervalo = (elementos.length - 1) / 2; intervalo > 0; intervalo--) {
            Integer inicio = 0;
            Integer meio = intervalo;
            while( meio < elementos.length ) {
                if( elementos[inicio].compareTo(elementos[meio]) == MAIOR ) {
                    aux = elementos[inicio];
                    elementos[inicio] = elementos[meio];
                    elementos[meio] = aux;
                }
                inicio++;
                meio++;
            }
        }
        
    }

}
