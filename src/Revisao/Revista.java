
package Revisao;

public class Revista extends MaterialBibliografico {

    public Revista(String localizacao, String titulo, String autores, int edicao, int ano) {
        super(localizacao, titulo, autores, edicao, ano,5);
    }

    
    @Override
    public boolean Devolver() {
        if(getQuantidade() < 5){
            setQuantidade(getQuantidade() +1);
            return true; }
            else{
                    return false;
                    }
            
        }
    }

   
    

