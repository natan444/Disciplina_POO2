
package Aulas.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main2 {
    public static void main(String[] args) {
        
    
       FIla fila= new FIla(10);
        System.out.println(fila);
        
        Escrever pares= new Escrever(2, 2, 10, 500, fila);
        Escrever impares= new Escrever(1, 2, 10, 1500, fila);
        
        ExecutorService executorThreads= Executors.newCachedThreadPool();
        
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        // encerra threads trabalhadoras quando suas tarefas terminarem
        executorThreads.shutdown();
        
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(fila);
}
}
