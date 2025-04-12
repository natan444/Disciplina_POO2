package Aulas.arquivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo4 {
    public static void main(String[] args) {
        File arq= new File("./arquivo2.txt");
        
     try { 
         
         FileWriter writer= new FileWriter(arq);
         writer.write("Conteudo do arquivo2.txt\n\n");
         writer.close();
     }catch(IOException ex){
         ex.printStackTrace();
     }
}
}
