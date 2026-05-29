// Herança: criando uma classe especializada 
// que estende (extends) a classe generica Animal
public class Cachorro extends Animal {
    // sobrescrevendo (@override) o método emitirSom da classe pai Animal
    @Override
    protected void emitirSom() {
        System.out.println("Au au au au!");
    }

}
