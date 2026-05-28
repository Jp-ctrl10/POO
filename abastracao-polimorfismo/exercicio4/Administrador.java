package exercicio4;

public class Administrador extends Usuario implements Autenticavel{
    @Override
    public  boolean autenticar(String senha){
        return "123".equals(senha);
     }
    @Override
    public String getNomeUsuario(){
       return super.getNomeUsuario();
    }
@Override 
public void setNomeUsuario(String nomeUsuario){
    super.setNomeUsuario(nomeUsuario);
    
}

}
