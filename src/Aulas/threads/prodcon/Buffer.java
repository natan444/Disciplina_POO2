
package Aulas.threads.prodcon;

public class Buffer {
    private int valor;
    private boolean ocupado;
    
    public Buffer(){
        valor=-1;
        ocupado=false;
    }
    
    public synchronized void set(int valor) throws Exception{
        while(ocupado==true){
            System.out.println("Tentou escrever no buffer mas esta ocupado");
            wait();
    }
        this.valor=valor;
        ocupado=true;
        notifyAll();
    }
    public synchronized int get() throws Exception{
        while (!ocupado) {            
            System.out.println("Tentou ler mas o buffer esta vazio");
            wait();
        }
        
        int aux=valor;
        valor=-1;
        ocupado= false;
        notifyAll();
        
        return aux;
    }
}
