public class Teste {

    public static void main(String Args[]) {
        Gerador g = new Gerador();
        Integer[] numeros = g.gerarNumerosAleatorios(10, 100);
        
        for (Integer i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "\n");
        }
        SortElements testeOrdenacao = new Bubble();
        testeOrdenacao.sortItems(numeros);
        System.out.println("Algoritmo Ordenacao\n");
        for (Integer i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + "\n")
        }
    }
}
