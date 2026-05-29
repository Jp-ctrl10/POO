public class Produto {
    private String nomeProduto;
    private Double precoProduto;


    public Produto ( String nome, Double preco) {
        this.nomeProduto = nome;
        this . precoProduto = preco;
    }

     public void setPreco (Double preco) {
        if (preco > 0 ) {
            this.precoProduto = preco;
        } else {
             System.out.println("Erro; preco nao pode ser negativo ou zarado");
        }
     }
     public String getNomeProduto() {
        return this.nomeProduto;
     }
     public Double getPrecoProduto() {
        return this.precoProduto;
     }
    
}
