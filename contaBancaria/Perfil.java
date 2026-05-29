public class Perfil {
    private String email = "";

    public void setEmail(String emailinformado) {
        
        if (emailinformado.contains("@") && emailinformado.contains(".")) {
            this.email = emailinformado;
        } else {
            System.out.println("Erro: O e-mail '" + emailinformado + "' é inválido!");
        }
    }

    public String getEmail() {
        return this.email;
    }
}
