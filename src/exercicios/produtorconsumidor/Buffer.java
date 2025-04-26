
package exercicios.produtorconsumidor;


import java.util.ArrayList;

public class Buffer {
    private int valor;
    private boolean ocupado;
     private ArrayList<Integer> vetor;
    
    public Buffer(int tamanho){
        valor=tamanho;
        ocupado=false;
        this.vetor= new ArrayList<>(tamanho);
    }
    
    public synchronized void set(int valor) throws Exception{
        while(ocupado==true){
            System.out.println("Tentou escrever no buffer mas esta ocupado");
            wait();
    }
        this.vetor.addLast(valor);
        ocupado=true;
        notifyAll();
    }
    public synchronized int get() throws Exception{
        while (!ocupado) {            
            System.out.println("Tentou ler mas o buffer esta vazio");
            wait();
        }
        
        int aux= this.vetor.removeFirst();
        ocupado= false;
        notifyAll();
        
        return aux;
    }
}
