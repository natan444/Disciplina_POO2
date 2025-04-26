
 
package Aulas.threads.prodcon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main3 {
    public static void main(String[] args) {
        Buffer buffer= new Buffer();
        
        Produtor produtor= new Produtor(buffer, 750);
        Consumidor consumidor= new Consumidor(buffer, 1500);
        
        ExecutorService executorThreads= Executors.newCachedThreadPool();
        
        executorThreads.execute(produtor);
        executorThreads.execute(consumidor);
        
       
        executorThreads.shutdown();
        
    }
}
