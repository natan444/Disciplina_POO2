
package Aulas.threads;
import java.util.Arrays;

public class FIla {
    private int[] vetor;
    private int indice;

    public FIla(int tamanho) {
        vetor= new int[tamanho];
        this.indice = 0;
    }
    
      @Override
    public String toString(){
        return Arrays.toString(vetor);
                
    
}
     
//    public void adicionar(int valor, int delay){
    public synchronized void adicionar(int valor, int delay){
        try {
            int i= indice;
            Thread.sleep(delay);

            vetor[i]= valor;
            System.out.println(valor + " Adicionado");
            indice++;
        } catch (InterruptedException ex) {
            ex.printStackTrace();
}
        }
    }
    
  
