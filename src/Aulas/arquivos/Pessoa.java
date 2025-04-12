

package Aulas.arquivos;

import java.io.Serializable;


public class Pessoa implements Serializable{ // faz a jvm entender qe o objetos podem ser descompactados e compactados;
    private String nome;
    private String cpf;
    
    public Pessoa(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome!=null){
            this.nome = nome;
        }else { throw new  RuntimeException ("Nome nao pode ser nulo");
           }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")){
        this.cpf = cpf;
    }else{
            throw new RuntimeException("O CPF nao pode ser nulo e deve estar no formato XXX.XXX.XXX-XX");
        }
    }

    @Override
    public String toString() {
        return getNome() + "" + getCpf();
    }
    
    
    
    
}

