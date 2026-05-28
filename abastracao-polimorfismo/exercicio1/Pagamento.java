package exercicio1;

/*exercicio 1 - classe abstrata como template
(template Method)*/

public abstract class Pagamento {
    public final void processar (Double valor){
        validarPagamento(valor);
        Double taxa = calcularTaxa(valor);
        confirmarPagamento(valor+taxa);
    }

    //metodo protegido
    protected void validarPagamento(Double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("valor invalido!");
        }
    }
    protected abstract Double  calcularTaxa(Double valor);

    protected void confirmarPagamento(Double total){

    System.out.println("Pagamento Confirmado... R$" + total);
}
    
}
