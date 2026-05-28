package exercicio1;

public class TesteMainPagamento {
    public static void main(String[]args) {
Pagamento pagamento = new PagamentoCartao();
//executando o  metodo da classe generi 'processarPagamento()'
pagamento.processar(500.00);
    }
}
