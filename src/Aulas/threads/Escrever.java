
package Aulas.threads;

//essa interface pode gerar probelmas pois: o etodo run nao tem retorno

public class Escrever implements Runnable{
    private int inicio,passo,fim;
    private FIla fila;
    //precisamos colocar um slip para poder visualizar a dinamica de execucao 
    private int delay=20;

    public Escrever(int inicio, int passo, int fim, int delay, FIla fila) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
        this.fila=fila;
    }
    
    // interface runnable para aplicar threads
    @Override
    public void run(){
        for (int i = inicio; i < fim; i+= passo) {
            fila.adicionar(i,delay);
           
        }
    
     
     //nao tem como tratar a excessao depois, 
     
     
}
}
