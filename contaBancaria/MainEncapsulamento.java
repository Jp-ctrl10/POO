public class MainEncapsulamento {
    
        public static void main (String[] args){
 
            System.out.println("----TESTANDO ENCAPSULAMENTO----");

            System.out.println("Exercicio 1:Conta Bancaria");
         
            ContaBancaria minhaConta = new ContaBancaria("robson otavio ");
            minhaConta.depositar(-50.00);
            System.out.println("Saldo autal e....R$" + minhaConta.getSaldoConta()); 

            minhaConta.depositar(153.50);
            System.out.printf("O saldo apos deposito e'...R$ %.2f\n " , minhaConta.getSaldoConta());

            System.out.println("---------Exercicio 2. Testando a classe produto------------\n                      Notebook"); 
            // instanciando um novo objeto da classe produto

            Produto meuProduto = new Produto("Notebook", 3800.50);

            System.out.println("O nome do produto é: " + meuProduto.getNomeProduto());
            System.out.println("O preco do produto é: " + meuProduto.getPrecoProduto());
            System.out.println("------------------------------------------------------------");

            meuProduto.setPreco(3500.00);

            System.out.println("Novo preco promocional: " +meuProduto.getPrecoProduto());

            System.out.println("--------------Exercicio 3: Hierarquia e protected---------------------");
            Gerente gerentaVendas = new Gerente("Henrique", 8500.50);
            System.out.println("O funcionario gerente" + gerentaVendas.nomeFuncionario);
        gerentaVendas.bonusSalarial();
        System.out.println("O salario do gerente com bonus " + gerentaVendas.nomeFuncionario +
            " com bonus " + gerentaVendas.getSalario()); 
            System.out.println("Exercicio 5: Validacao de E-mail");

        Perfil meuPerfil= new Perfil();

        meuPerfil.setEmail("pedrim.ph@gmail.com");
        meuPerfil.setEmail("pedrim.phgmail.com");
        System.out.println("E-mail atual no sistema " + meuPerfil.getEmail());
    }
}