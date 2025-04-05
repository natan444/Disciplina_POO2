

package Aulas.excecoes;

public class Exemplo1 {
    public static void main(String[] args) {
        String[] vetor= new String[5];
        
        vetor[0]= "iFSP";
        System.out.println(vetor[0].toLowerCase());
        System.out.println(vetor[1]);
//        System.out.println(vetor[1].toLowerCase());

        System.out.println(vetor[5]);
        System.out.println(vetor[0]);
    }
    
}
