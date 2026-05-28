package exercicio4;

public interface Autenticavel {
    boolean autenticar(String senha);

    String getNomeUsuario();

    void setNomeUsuario(String nome);
    
}
