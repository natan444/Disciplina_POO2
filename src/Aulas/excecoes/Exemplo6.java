package Aulas.excecoes;

public class Exemplo6 {

    public static void main(String[] args) {
        Data niver = new Data();
        try {
            niver.setDia(-1);
            niver.setMes(-1);
            niver.setAno(2025);
            

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } 
}
