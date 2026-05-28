package exercicio3;

public class TestaMainCalculadora {
    // para executar o teste 
    public static void main(String [] args) {
        
    Calculadora calc = new Calculadora();
       System.out.println("o resultado da soma com numeros inteiros: " +
       calc.somar(4,7));
        // segundo 
        
         System.out.println("o resultado da soma com numeros fracionais: "+
          calc.somar(4.8, 5.0));
    }
}
