public class Gerente extends Funcionario {
    public Gerente(String nome, Double salario){
        super(nome, salario);
    }

    public void bonusSalarial(){
        this.salarioFuncionario += 500.00;

    }

    public double getSalario(){
        return this.salarioFuncionario;
    }
}
