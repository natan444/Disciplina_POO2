
package Aulas.arquivos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Exemplo5 {
    public static void main(String[] args) {
        
        Pessoa p1= new Pessoa("joao","888.888.888-88");
        Pessoa p2= new Pessoa("Maria","777.777.777-77");
        
        System.out.println(p1);
        System.out.println(p2);
        
        File arq= new File ("./arquivo4.ser");
        
        try {
            FileOutputStream stream= new FileOutputStream(arq);
            
            ObjectOutputStream output= new ObjectOutputStream(stream);
            
            output.writeObject(p1);// descompacta um obejto e tranfere para o arquivo 
            output.writeObject(p2);
            
            output.close();
            stream.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
