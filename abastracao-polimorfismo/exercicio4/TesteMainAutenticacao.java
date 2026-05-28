package exercicio4;

public class TesteMainAutenticacao {
    public static void main(String[]args){

        Autenticavel admin = new Administrador();

        admin.setNomeUsuario( "Jottape");

        System.out.println("O usuario: " + admin.getNomeUsuario() 
        + " foi autenticado? " + admin.autenticar("123"));

        admin.setNomeUsuario( "Davi lindo");

        System.out.println("O usuario: " + admin.getNomeUsuario() 
        + " foi autenticado? " + admin.autenticar("67"));

    }
}
