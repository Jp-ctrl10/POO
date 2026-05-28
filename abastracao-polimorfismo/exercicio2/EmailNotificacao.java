package exercicio2;

public class EmailNotificacao implements Notificacao {
    @Override //sobre escrita d métdoo
    public void enviar(String mensagem){

        System.out.println("Enviar E-mail:" + mensagem);
    }
    
    
}
