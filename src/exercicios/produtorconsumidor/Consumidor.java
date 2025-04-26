
package exercicios.produtorconsumidor;


    
public class Consumidor implements Runnable{
    private Buffer buffer;
    private int delay;

    public Consumidor(Buffer buffer, int delay) {
        this.buffer = buffer;
        this.delay = delay;
    }
    
    @Override
    public void run(){
        try {
            for (int i = 10; i <= 100; i+=10) {
                System.err.println(">" + buffer.get());
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

