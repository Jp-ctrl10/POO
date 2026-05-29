public class ContaBancaria {
    private String titularConta;
    private Double saldoConta;


    public ContaBancaria (String nomeTitularConta){
        this.titularConta = nomeTitularConta;
        this.saldoConta = 200.0;
    }

    public Double getSaldoConta() {
        return this.saldoConta;
    }
        
    public String getTitular(){
        return this.titularConta;
    }

    public void depositar(Double valorDepositado){
        if (saldoConta > 0 ){
            this.saldoConta += valorDepositado;
            System.out.println("Deposito Realizado!");
        }
        else{
            System.out.println("Valor invalido para deposito");
        }
    }

}