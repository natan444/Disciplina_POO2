
 
package exercicios.produtorconsumidor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    

    public static void main(String[] args) {
        Aulas.threads.prodcon.Buffer buffer= new Aulas.threads.prodcon.Buffer();
        
        Aulas.threads.prodcon.Produtor produtor= new Aulas.threads.prodcon.Produtor(buffer, 750);
        Aulas.threads.prodcon.Consumidor consumidor= new Aulas.threads.prodcon.Consumidor(buffer, 1500);
        
        ExecutorService executorThreads= Executors.newCachedThreadPool();
        
        executorThreads.execute(produtor);
        executorThreads.execute(consumidor);
        
       
        executorThreads.shutdown();
        
    }
}

