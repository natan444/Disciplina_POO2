
package Aulas.threads;

//essa interface pode gerar probelmas pois: o etodo run nao tem retorno

public class Imprimir implements Runnable{
    private int inicio,passo,fim;
    //precisamos colocar um slip para poder visualizar a dinamica de execucao 
    private int delay=20;

    public Imprimir(int inicio, int passo, int fim, int delay) {
        this.inicio = inicio;
        this.passo = passo;
        this.fim = fim;
        this.delay = delay;
    }
    
    // interface runnable para aplicar threads
    @Override
    public void run(){
        try{
        for (int i = inicio; i < fim; i+= passo) {
            System.out.println(">" + i);
            Thread.sleep(delay); 
        }
    } catch(InterruptedException ex){
        ex.printStackTrace();
    }
     
     //nao tem como tratar a excessao depois, 
     
     
}
}
