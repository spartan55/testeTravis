import java.util.Random;


public class Gerador {
    
    public Integer[] gerarNumerosAleatorios() {
        
        Integer[] elementos = new Integer[10000];
        Random random = new Random();
        
        for(int i=0; i < 10000; i++) {
            elementos[i] = random.nextInt(10000);
        }
        
        return elementos;     
    }
    
    public Integer[] gerarNumerosAleatorios(int quantidade, int bound) {
        
        Integer[] elementos = new Integer[quantidade];
        Random random = new Random();
        
        for(int i=0; i < quantidade; i++) {
            elementos[i] = random.nextInt(bound);
        }
        
        return elementos;        
    }
    
}
