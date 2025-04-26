
package exercicios.produtorconsumidor;
import java.util.ArrayList;

public class Produtor implements Runnable{
    private int delay;
    private Buffer buffer;
   

    public Produtor(int delay, Buffer buffer) {
        this.delay = delay;
        this.buffer = buffer;
        
    }

       @Override
    public void run(){
        try {
            for (int i = 10; i <= 100; i+=10) {
                buffer.set(i);
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
