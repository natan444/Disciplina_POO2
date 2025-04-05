

package Revisao;

public class Chave implements Emprestavel {

      
    private String armario;
    private boolean emprestado;

    public Chave(String armario) {
        this.armario = armario;
        setEmprestado(false);
    }

    

    public String getArmario() {
        return armario;
    }

    private void setArmario(String armario) {

        if(armario.charAt(0) == 'A'){
        this.armario = armario;
    }
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    private void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String getNomeObjeto() {
    return getArmario();

}   

    @Override
    public boolean podeEmprestar() {
        
        boolean pode= false;
        if(this.emprestado== false){
            pode=true;
        }
        return pode;
    }

    @Override
    public boolean Emprestar() {
       boolean empresta= false;
       if(podeEmprestar()){
           setEmprestado(true);
           empresta= true;
       }
       return empresta;       
               
}
    

    @Override
    public boolean Devolver() {
        boolean devolveu= false;
        if(this.emprestado== true){
            setEmprestado(false);
            devolveu= true;
        }
        return devolveu;
    }
  

