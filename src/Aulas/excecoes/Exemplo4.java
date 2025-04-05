

package Aulas.excecoes;

public class Exemplo4 {
    public static void main(String[] args) {
        String[] vetor= new String[5];
        
        try{
        
            vetor[0]= "iFSP";
            System.out.println(vetor[0].toLowerCase());
            System.out.println(vetor[1]);
            System.out.println(vetor[1].toLowerCase());

            System.out.println(vetor[5]);
            
        }catch(ArrayIndexOutOfBoundsException ex1){
            System.out.println("A exceção ArrayIndexOutofBoundsExeception foi capturado");
            
        }catch(NullPointerException ex2){
            System.out.println(ex2.getMessage());
//            ex2.printStackTrace();
            
        } finally{// utilizado paraliberar recursos
            System.out.println("Bloco finally executado");
        }
        
        System.out.println(vetor[0]);
    }
    
}
