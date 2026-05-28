package exercicio2;

public class TesteMainNotificacao {

    public static void main (String[] args){
        // Quando usar Interface
        Notificacao avisoEmail= new EmailNotificacao();
        Notificacao avisoSms = new SmsNotificacao();

        avisoEmail.enviar("Ola por email.");
        avisoSms.enviar("Ola por SMS.");
    }
    
    
}
