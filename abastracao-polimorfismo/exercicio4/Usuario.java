package exercicio4;
/*
exerciciio4: classe abstrata x interface
*/
public abstract class Usuario { 
    protected String nomeUsuario;

    public String getNomeUsuario() {
return this.nomeUsuario;
    }
    
    public void setNomeUsuario(String nome) {
        this.nomeUsuario = nome;
    }
}
