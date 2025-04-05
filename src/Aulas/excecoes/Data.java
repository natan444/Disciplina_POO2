/*
 */
package Aulas.excecoes;


public class Data {
    private int dia,mes,ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia>=31){
            this.dia = dia;
        }else{
            throw new RuntimeException("o dia deve estar entre 1 e 31");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes (int mes) throws Exception {
        if (mes>=1 && mes <=12) {
           this.mes = mes; 
        }else{
            throw new Exception ("O mẽs deve estar entre 1 e 12");
        }
        
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws Exception {
        if(ano <= 0){
            this.ano = ano;
        }else{
//            throw new Exception ("O Ano deve ser maior que zero");
throw new Erro_verificado("O Ano deve ser maior que zero");
        }
    }
    
}
