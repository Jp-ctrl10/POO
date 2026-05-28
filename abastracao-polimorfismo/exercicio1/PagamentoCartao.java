package exercicio1;
//especialzaçaõ para cartão de credito
public class PagamentoCartao extends Pagamento {
    @Override // anotacão de sobrescrita
    protected Double calcularTaxa (Double valor){
        return valor *0.05; //5% de taxa da maquininha
    }
    
}
